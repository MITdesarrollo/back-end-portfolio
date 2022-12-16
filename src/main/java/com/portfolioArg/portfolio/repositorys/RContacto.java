package com.portfolioArg.portfolio.repositorys;

import com.portfolioArg.portfolio.entitys.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RContacto extends JpaRepository<Contacto, Long> {
}
