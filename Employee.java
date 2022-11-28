package org.example;

import java.util.Objects;

public class Employee {
  private String surname;
  private String inits;
  private String phone;

  public Employee() {}

  public Employee(String surname, String inits, String phone) {
    this.surname = surname;
    this.inits = inits;
    this.phone = phone;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getInits() {
    return inits;
  }

  public void setInits(String inits) {
    this.inits = inits;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return surname.equals(employee.surname)
        && inits.equals(employee.inits)
        && phone.equals(employee.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surname, inits, phone);
  }
}
