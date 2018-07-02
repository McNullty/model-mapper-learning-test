package com.mladen.cikara.modelmapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

class UserMappingTest {

  @Test
  void simpleMapping() {

    final User user = new User.Builder()
        .email("test@test.com")
        .password("secret")
        .firstName("Test")
        .lastName("Test")
        .authorities(Authority.ROLE_USER).build();

    final ModelMapper modelMapper = new ModelMapper();

    final UserDto userDto = modelMapper.map(user, UserDto.class);

    assertThat(userDto.getEmail()).isEqualTo(user.getEmail());
    assertThat(userDto.getUuid()).isEqualTo(user.getUUID());
    assertThat(userDto.getFirstName()).isEqualTo(user.getFirstName());
    assertThat(userDto.getLastName()).isEqualTo(user.getLastName());
    assertThat(userDto.getAuthorities()).isEqualTo(user.getAuthorities());
  }

}
