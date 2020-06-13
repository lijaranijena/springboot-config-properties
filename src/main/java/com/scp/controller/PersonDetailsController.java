package com.scp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.scp.config.PersonDetailsConfig;
import com.scp.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonDetailsController {

    @Autowired
    private PersonDetailsConfig personDetailsConfig;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public PersonModel getPersonDetails(){
        //  ObjectMapper mapper = new ObjectMapper();
        // it will work with normal model class
       // PersonModel model  = mapper.convertValue(personDetailsConfig, PersonModel.class);

        return PersonModel.builder()
                .firstName(personDetailsConfig.getFirstName())
                .lastName(personDetailsConfig.getLastName())
                .place(personDetailsConfig.getPlace())
                .age(personDetailsConfig.getAge())
                .build();
    }


}
