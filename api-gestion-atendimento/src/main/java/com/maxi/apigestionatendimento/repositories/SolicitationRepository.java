package com.maxi.apigestionatendimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxi.apigestionatendimento.entities.Solicitation;

public interface SolicitationRepository extends JpaRepository<Solicitation, Integer>{
    
}
