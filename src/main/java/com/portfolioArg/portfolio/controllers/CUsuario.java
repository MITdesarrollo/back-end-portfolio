package com.portfolioArg.portfolio.controllers;


import com.portfolioArg.portfolio.entitys.Usuario;
import com.portfolioArg.portfolio.services.SUsuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class CUsuario {

    private final SUsuario userServ;


    public CUsuario(SUsuario userServ) {
        this.userServ = userServ;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id")Long id){
        Usuario usuario = userServ.buscarUsuID(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
}
