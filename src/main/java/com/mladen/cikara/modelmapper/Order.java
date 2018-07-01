package com.mladen.cikara.modelmapper;

public class Order {
  Customer customer;
  Address billingAddress;

  Order(Customer customer, Address billingAddress) {
    super();
    this.customer = customer;
    this.billingAddress = billingAddress;
  }

  public Address getBillingAddress() {
    return billingAddress;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
