package com.mladen.cikara.modelmapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;

class GettingStartedExampleTest {

  @Test
  void expilicitMappingWithTypeMap() throws Exception {
    final ModelMapper modelMapper = new ModelMapper();

    final TypeMap<Order, OrderDTO> typeMap = modelMapper.createTypeMap(Order.class, OrderDTO.class);

    typeMap.addMapping(src -> src.getBillingAddress().getStreet(), OrderDTO::setBillingStreet);

    final Order order = new Order(new Customer(new Name("TestFirstName", "TestLasetName")),
        new Address("TestStreet", "TestCity"));

    final OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);

    assertEquals(order.getCustomer().getName().getFirstName(), orderDTO.getCustomerFirstName());
    assertEquals(order.getCustomer().getName().getLastName(), orderDTO.getCustomerLastName());
    assertEquals(order.getBillingAddress().getStreet(), orderDTO.getBillingStreet());
    assertEquals(order.getBillingAddress().getCity(), orderDTO.getBillingCity());
  }

  @Test
  void explicitMapping() throws Exception {
    final ModelMapper modelMapper = new ModelMapper();
    modelMapper.addMappings(new PropertyMap<Order, OrderDTO>() {
      @Override
      protected void configure() {
        map().setBillingStreet(source.getBillingAddress().getStreet());
        map(source.billingAddress.getCity(), destination.billingCity);
      }
    });

    final Order order = new Order(new Customer(new Name("TestFirstName", "TestLasetName")),
        new Address("TestStreet", "TestCity"));

    final OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);

    assertEquals(order.getCustomer().getName().getFirstName(), orderDTO.getCustomerFirstName());
    assertEquals(order.getCustomer().getName().getLastName(), orderDTO.getCustomerLastName());
    assertEquals(order.getBillingAddress().getStreet(), orderDTO.getBillingStreet());
    assertEquals(order.getBillingAddress().getCity(), orderDTO.getBillingCity());
  }

  @Test
  void simpleMapping() {
    final Order order = new Order(new Customer(new Name("TestFirstName", "TestLasetName")),
        new Address("TestStreet", "TestCity"));

    final ModelMapper modelMapper = new ModelMapper();
    final OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);

    assertEquals(order.getCustomer().getName().getFirstName(), orderDTO.getCustomerFirstName());
    assertEquals(order.getCustomer().getName().getLastName(), orderDTO.getCustomerLastName());
    assertEquals(order.getBillingAddress().getStreet(), orderDTO.getBillingStreet());
    assertEquals(order.getBillingAddress().getCity(), orderDTO.getBillingCity());
  }

}
