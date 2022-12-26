package com.portfolioArg.portfolio.controllers;

import com.portfolioArg.portfolio.services.SContacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contacto")
@CrossOrigin(origins = "http://localhost:4200")
public class CContacto {
    @Autowired
    SContacto serCont;

}
