package com.muhammet.springboottest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserProfileControllerTest {

    @Autowired
    private UserProfileController controller;
    @Test
    void addUser() {
      ResponseEntity<Boolean> isSave=  controller.addUser("Canan","İzmir","0 999 888 7744");
      assertTrue(isSave.getBody().booleanValue());
    }
}