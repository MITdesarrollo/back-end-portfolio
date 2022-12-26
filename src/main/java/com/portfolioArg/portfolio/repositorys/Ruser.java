package com.portfolioArg.portfolio.repositorys;

import com.portfolioArg.portfolio.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Ruser extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
