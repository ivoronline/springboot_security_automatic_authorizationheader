package com.ivoronline.springboot_security_automatic_authorizationheader.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //==============================================================================
  // HELLO (Secured Resource)
  //==============================================================================
  @Secured("ROLE_USER")
  @RequestMapping("/Hello")
  public String hello() {
    return "Hello from Controller";
  }

  @Secured("ROLE_USER")
  @RequestMapping("/Restricted")
  public String restricted() { return "Hello from Restricted Resource"; }

}

