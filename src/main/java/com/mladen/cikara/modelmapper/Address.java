package com.mladen.cikara.modelmapper;

public class Address {
  String street;
  String city;

  Address(String street, String city) {
    super();
    this.street = street;
    this.city = city;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setStreet(String street) {
    this.street = street;
  }
}
