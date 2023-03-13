package com.swedbank.channels.recruitment.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private  Long id;

  private String name;
  private String sureName;
  private String level;
  private String birthDate;
  private String description;

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

  public String getSureName() {
    return sureName;
  }

  public void setSureName(String sureName) {
    this.sureName = sureName;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String type) {
    this.level = type;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
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
           ", sureName='" + sureName + '\'' +
           ", type='" + level + '\'' +
           ", birthDate='" + birthDate + '\'' +
           ", description='" + description + '\'' +
           '}';
  }
}
