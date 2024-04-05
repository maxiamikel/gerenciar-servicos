package com.maxi.apigestionatendimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maxi.apigestionatendimento.entities.Technic;

public interface TechnicRepository extends JpaRepository<Technic, Integer>{
    
    @Query("SELECT MAX('id')FROM Technic")
    public Integer getMaxId();
}
