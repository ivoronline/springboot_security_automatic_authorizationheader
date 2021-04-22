package com.ivoronline.springboot_security_automatic_authorizationheader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
public class SpringbootSecurityAutomaticAuthorizationheaderApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootSecurityAutomaticAuthorizationheaderApplication.class, args);
  }

}
