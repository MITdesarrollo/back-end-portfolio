package com.portfolioArg.portfolio.repositorys;

import com.portfolioArg.portfolio.entitys.Experiencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Long> {
}
