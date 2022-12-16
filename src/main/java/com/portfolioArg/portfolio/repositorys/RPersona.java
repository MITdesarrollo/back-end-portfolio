package com.portfolioArg.portfolio.repositorys;

import com.portfolioArg.portfolio.entitys.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository<Persona, Long> {

}
