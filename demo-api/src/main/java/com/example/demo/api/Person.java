package com.example.demo.api;


import java.io.Serializable;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Serializable {

  private String name;
  private LocalDate birth;
}
