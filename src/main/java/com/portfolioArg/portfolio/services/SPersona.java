package com.portfolioArg.portfolio.services;

import com.portfolioArg.portfolio.entitys.Persona;
import com.portfolioArg.portfolio.repositorys.RPersona;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.List;

@Service
@Transactional
public class SPersona {
    @Autowired
    public RPersona repoPersona;


    public List<Persona> list(){
        return repoPersona.findAll();
    }

    public Persona getPersona(Long id){
        Persona pers = repoPersona.findById(id).orElse(null);
        return pers;
    }

    public void save(Persona pers){
        repoPersona.save(pers);
    }

    public void delete(Long id){
        repoPersona.deleteById(id);
    }

    public void edit(Persona pers){
        repoPersona.save(pers);
    }
}
