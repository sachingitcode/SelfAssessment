package com.springProject.springProject1.controller;

import com.springProject.springProject1.model.Users;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @RequestMapping(path = "/alert/{id}", method = RequestMethod.GET)
    public MappingJacksonValue raiseAlertById(@PathVariable(value = "id") String id) {
        return new MappingJacksonValue("Accepted");
    }


    public ResponseEntity getLogin(@RequestBody Users user) {
        String response = "";
        return ResponseEntity
                .status(HttpStatus.OK)
                .header(HttpHeaders.ACCEPT)
                .body(new MappingJacksonValue(response));
    }
}
// Why MappingJacksonValue
