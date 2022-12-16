package com.portfolioArg.portfolio.services;

import com.portfolioArg.portfolio.entitys.Herramienta;
import com.portfolioArg.portfolio.entitys.Proyecto;
import com.portfolioArg.portfolio.repositorys.RProyecto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SProyecto {
    @Autowired
    RProyecto proyectoRepo;


    public List<Proyecto> list(){
        return proyectoRepo.findAll();
    }

    public Proyecto getPro(Long id){
        Proyecto pro = proyectoRepo.findById(id).orElse(null);
        return pro;
    }
    public void save(Proyecto pro){
        proyectoRepo.save(pro);
    }
    public void edelete(Long id){
        proyectoRepo.deleteById(id);
    }
    public void edit(Proyecto pro){
        proyectoRepo.save(pro);
    }
}
