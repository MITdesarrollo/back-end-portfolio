package com.portfolioArg.portfolio.services;

import com.portfolioArg.portfolio.entitys.Educacion;
import com.portfolioArg.portfolio.repositorys.REducacion;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion eduRepo;

    public List<Educacion> list(){
        return eduRepo.findAll();
    }

    public Educacion getEstudio(Long id){
        Educacion edu = eduRepo.findById(id).orElse(null);
        return edu;
    }
    public void save(Educacion edu){
        eduRepo.save(edu);
    }
    public void edelete(Long id){
        eduRepo.deleteById(id);
    }
    public void edit(Educacion edu){
        eduRepo.save(edu);
    }


}
