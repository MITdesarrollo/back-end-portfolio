package com.portfolioArg.portfolio.repositorys;


import com.portfolioArg.portfolio.entitys.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository<Proyecto, Long>{
}
