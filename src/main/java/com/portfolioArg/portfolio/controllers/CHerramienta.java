package com.portfolioArg.portfolio.controllers;

import com.portfolioArg.portfolio.entitys.Herramienta;
import com.portfolioArg.portfolio.entitys.Persona;
import com.portfolioArg.portfolio.services.SHerramienta;
import com.portfolioArg.portfolio.services.SPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("herramienta")
@CrossOrigin(origins = "http://localhost:4200")
public class CHerramienta {
    @Autowired
    SHerramienta servHerra;

    @GetMapping("/list")
       public ResponseEntity<List<Herramienta>> list(){
       List<Herramienta> list = servHerra.list();
       return new ResponseEntity(list, HttpStatus.OK);}

    @GetMapping("/detail/{id}")
       public ResponseEntity<Herramienta> detalle(@PathVariable("id") Long id){
       Herramienta herramienta = servHerra.getErr(id);
       return new ResponseEntity(herramienta, HttpStatus.OK);
  }

    @PostMapping("/create")
    public void create(@RequestBody Herramienta herramienta){
        servHerra.save(herramienta);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        servHerra.edelete(id);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Herramienta herramienta){
        servHerra.edit(herramienta);
    }
}
