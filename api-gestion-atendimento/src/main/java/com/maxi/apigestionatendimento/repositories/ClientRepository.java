package com.maxi.apigestionatendimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxi.apigestionatendimento.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
    
}
