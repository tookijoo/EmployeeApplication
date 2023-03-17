package com.swedbank.channels.recruitment.model;

import org.thymeleaf.util.StringUtils;

import java.util.List;

public class EmployeeFrom {
  private String name;
  private String surname;
  private String level;
  private String birthDate;
  private String description;
  private List<String> interests;

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

  public void setLevel(String level) {
    this.level = level;
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

  public List<String> getInterests() {
    return interests;
  }

  public void setInterests(List<String> interests) {
    this.interests = interests;
  }

  public Employee toEmployee() {
    Employee employee = new Employee();
    employee.setName(getName());
    employee.setSurname(getSurname());
    employee.setLevel(getLevel());
    employee.setBirthDate(getBirthDate());
    String descriptionString = getDescription();
    if (descriptionString != null && !  descriptionString.isEmpty()) {
      descriptionString += " :: " + getInterestsDescription();
    } else {
      descriptionString += getInterestsDescription();
    }
    employee.setDescription(descriptionString);
    return employee;
  }

  private String getInterestsDescription() {
    return  StringUtils.join(getInterests(), ", ");
  }

  @Override
  public String toString() {
    return "EmployeeFrom{" +
           "name='" + name + '\'' +
           ", sureName='" + surname + '\'' +
           ", level='" + level + '\'' +
           ", birthDate='" + birthDate + '\'' +
           ", description='" + description + '\'' +
           ", interests=" + interests +
           '}';
  }
}
