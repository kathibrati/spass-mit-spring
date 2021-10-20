package com.example.servingwebcontent.service;

import com.example.servingwebcontent.document.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.servingwebcontent.repository.PersonRepository;

@Service
public class PersonService {

    private final PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public void save(final Person person) {
        repository.save(person);
    }

    public Person findById(final String id) {
        return repository.findById(id).orElse(null);
    }
}
