package com.portfolioArg.portfolio.services;

import com.portfolioArg.portfolio.entitys.Usuario;
import com.portfolioArg.portfolio.repositorys.Ruser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SUsuario {
    private final Ruser repoUser;

@Autowired
    public SUsuario(Ruser repoUser) {
        this.repoUser = repoUser;
    }
    public Usuario addUsuario(Usuario usuario){
    return repoUser.save(usuario);
    }

    public List<Usuario> listUsuarios(){
    return repoUser.findAll();
    }

    public Usuario editUser(Usuario usuario){
    return repoUser.save(usuario);
    }

    public void delete(Long id){
     repoUser.deleteById(id);
    }
    public Usuario buscarUsuID(Long id){
    return repoUser.findById(id).orElse(null);
    }
}
