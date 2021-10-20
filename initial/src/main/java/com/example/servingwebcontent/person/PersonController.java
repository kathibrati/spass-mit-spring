//package com.example.servingwebcontent.person;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.Arrays;
//import java.util.List;
//
//
//@RestController
//@RequestMapping(path = "api/v1/persons")
//public class PersonController {
//@GetMapping
//public List<Person> getPerson() {
//    return Arrays.asList(
//            new Person (
//                    1,
//                    "Katinka",
//                    "katinka@gmail.com123",
//                    29,
//                    LocalDate.of(1991, Month.NOVEMBER, 2)
//            ),
//            new Person (
//                    2,
//                    "Conrad",
//                    "Conrad@gmail.de123",
//                    25,
//                    LocalDate.of(1996, Month.JANUARY, 27)
//            )
////http://localhost:9200/Persons/_search  query matchquery feld id 1, mapping in java objekt
////Rest Template post for obj persons_search query klasse auf die gemapped werden soll -> returned ergebnis
//    );
//
//}
//
//
//}
