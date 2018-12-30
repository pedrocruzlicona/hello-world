package com.example.controller;

import java.util.List;
import com.example.dto.UserInformation;
import com.example.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{

   Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

   @Autowired HelloWorldService service;

   @GetMapping(value="/users")
   public List<UserInformation> getUsers(){

	List<UserInformation> response = service.getUsersInformation();
      
       LOG.info("Petition to User");
	   return response;
   }
}