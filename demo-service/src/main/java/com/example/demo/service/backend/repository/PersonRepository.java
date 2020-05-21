package com.example.demo.service.backend.repository;

import com.example.demo.service.backend.entity.Person;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

  List<Person> findByNameContainingIgnoreCase(String name);
}
