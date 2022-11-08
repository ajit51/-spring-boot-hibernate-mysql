package com.example.springboothibernatemysql.controller;

import com.example.springboothibernatemysql.dao.PersonDao;
import com.example.springboothibernatemysql.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spring-boot-orm")
public class PersonController {

    @Autowired
    private PersonDao dao;

    @PostMapping("/savePerson")
    public String save(@RequestBody Person person) {
        dao.savePerson(person);
        return "success";
    }

    @GetMapping("/getAll")
    public List<Person> getALlPersons() {
        return dao.getPerson();
    }
}
