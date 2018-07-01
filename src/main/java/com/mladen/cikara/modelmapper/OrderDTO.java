package com.mladen.cikara.modelmapper;

public class OrderDTO {
  String customerFirstName;
  String customerLastName;
  String billingStreet;
  String billingCity;

  public String getBillingCity() {
    return billingCity;
  }

  public String getBillingStreet() {
    return billingStreet;
  }

  public String getCustomerFirstName() {
    return customerFirstName;
  }

  public String getCustomerLastName() {
    return customerLastName;
  }

  public void setBillingCity(String billingCity) {
    this.billingCity = billingCity;
  }

  public void setBillingStreet(String billingStreet) {
    this.billingStreet = billingStreet;
  }

  public void setCustomerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
  }

  public void setCustomerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
  }
}
