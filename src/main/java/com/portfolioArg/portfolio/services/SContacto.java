package com.portfolioArg.portfolio.services;

import com.portfolioArg.portfolio.entitys.Contacto;
import com.portfolioArg.portfolio.repositorys.RContacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SContacto {
    @Autowired
    RContacto contacRepo;

    public List<Contacto> list(){
        return contacRepo.findAll();
    }

    public Contacto getCont(Long id){
        Contacto cont = contacRepo.findById(id).orElse(null);
        return cont;
    }
    public void save(Contacto cont){
        contacRepo.save(cont);
    }
    public void edelete(Long id){
        contacRepo.deleteById(id);
    }
    public void edit(Contacto cont){
        contacRepo.save(cont);
    }
}
