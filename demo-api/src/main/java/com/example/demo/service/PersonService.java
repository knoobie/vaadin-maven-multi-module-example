package com.example.demo.service;

import com.example.demo.api.Person;
import java.util.List;

public interface PersonService {

  List<Person> findPersons(String name);
}
