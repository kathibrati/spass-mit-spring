package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.document.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.servingwebcontent.service.PersonService;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    private final PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    public void save(@RequestBody final Person person) {
        service.save(person);
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable final String id) {
        return service.findById(id);
    }

    @GetMapping("/testsave")
    public ResponseEntity<String> save() {

        Person person = new Person(new Date().getTime(), "Sergej Gefährlich", "danger@test.de", 16, LocalDate.now());
        try {
//            throw new Exception();
            service.save(person);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Irgendwas is kaputt");
        }
        return ResponseEntity.ok(person +" wurde angelegt.");

    }

}
