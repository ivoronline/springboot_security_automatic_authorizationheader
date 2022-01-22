package com.ivoronline.springboot_security_automatic_authorizationheader.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@RestController
@EnableGlobalMethodSecurity(securedEnabled = true)
public class MyController {

  //==============================================================================
  // HELLO
  //==============================================================================
  @Secured("ROLE_USER")
  @RequestMapping("Hello")
   String hello() {
    return "Hello from Controller";
  }

}

