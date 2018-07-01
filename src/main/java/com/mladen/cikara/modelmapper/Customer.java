package com.mladen.cikara.modelmapper;

public class Customer {
  Name name;

  Customer(Name name) {
    super();
    this.name = name;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }
}
