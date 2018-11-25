package com.example.service;

import java.util.ArrayList;
import java.util.List;
import com.example.dto.ListToDo;
import com.example.dto.UserInformation;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService{

    public List<UserInformation> getUsersInformation(){
        List<UserInformation> users = new ArrayList<>();
        List<ListToDo> listToDo = new ArrayList<>();
        ListToDo toDo = new ListToDo();    
        toDo.setToDo("to study");
        toDo.setDone(false);
        listToDo.add(toDo); 
        toDo = new ListToDo(); 
        toDo.setToDo("to buy ");
        toDo.setDone(true);
        listToDo.add(toDo);    
        toDo = new ListToDo();
        toDo.setToDo("to play soccer ");
        toDo.setDone(false);
        listToDo.add(toDo);   
        toDo = new ListToDo();
        toDo.setToDo("to watch Netflix and YouTube ");
        toDo.setDone(true);
        listToDo.add(toDo);   
        UserInformation dto = new UserInformation();
        dto.setName("Pedro Cruz");
        dto.setAge(21);
        dto.setCountry("Mexico");
        dto.setToDo(listToDo);
        users.add(dto);
        
        return users;
    }
}