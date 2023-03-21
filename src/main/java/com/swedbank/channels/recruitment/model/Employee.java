package com.swedbank.channels.recruitment.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  Long id;

  private String name;
  private String surname;
  private String level;
  private String description;

  private Date birthDate;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String type) {
    this.level = type;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Employee{" +
           "id=" + id +
           ", name='" + name + '\'' +
           ", sureName='" + surname + '\'' +
           ", type='" + level + '\'' +
           ", birthDate='" + birthDate + '\'' +
           ", description='" + description + '\'' +
           '}';
  }
}
