package com.example.servingwebcontent.configuration;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.servingwebcontent.repository")
public class Config extends AbstractElasticsearchConfiguration {


    private final ElasticsearchConfig elasticsearchConfig;
    @Autowired
    public Config(ElasticsearchConfig elasticsearchConfig) {
        this.elasticsearchConfig = elasticsearchConfig;
    }

    @Bean
    @Override
    public RestHighLevelClient elasticsearchClient() {
        final ClientConfiguration config = ClientConfiguration.builder()
                .connectedTo(elasticsearchConfig.getUrl())
                .build();
        return RestClients.create(config).rest();
    }
}
