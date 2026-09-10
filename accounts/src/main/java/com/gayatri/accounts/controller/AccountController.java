package com.gayatri.accounts.controller;

import com.gayatri.accounts.constants.AccountConstants;
import com.gayatri.accounts.dto.CustomerDto;
import com.gayatri.accounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(path = "/api" , produces = (MediaType.APPLICATION_JSON_VALUE))
public class AccountController {

//    @GetMapping("/sayHello")
//    public String sayHello() {
//        return "hello from account MS";
//    }

    @PostMapping("/create")
   public ResponseEntity<ResponseDto>   createAccount(@RequestBody CustomerDto customerDto){


        return  ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(AccountConstants.STATUS_201,"Account created successfully"));

   }



}
