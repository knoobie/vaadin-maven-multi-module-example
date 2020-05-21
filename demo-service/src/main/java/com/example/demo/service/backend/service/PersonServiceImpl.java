package com.example.demo.service.backend.service;

import com.example.demo.service.PersonService;
import com.example.demo.service.backend.entity.Person;
import com.example.demo.service.backend.repository.PersonRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

  private final PersonRepository repository;

  @Autowired
  public PersonServiceImpl(PersonRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<com.example.demo.api.Person> findPersons(String name) {
    if (StringUtils.isBlank(name)) {
      return repository.findAll().stream()
        .map(Person::toAPI)
        .collect(Collectors.toList());
    }

    return repository.findByNameContainingIgnoreCase(name).stream()
      .map(Person::toAPI)
      .collect(Collectors.toList());
  }
}
