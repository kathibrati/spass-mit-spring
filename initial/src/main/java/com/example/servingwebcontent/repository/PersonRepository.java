package com.example.servingwebcontent.repository;

import com.example.servingwebcontent.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {
}
