package com.maxi.apigestionatendimento.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxi.apigestionatendimento.entities.LocalUser;

public interface LocalUserRepository extends JpaRepository<LocalUser, Integer>{
    Optional<LocalUser> findByCpf(String cpf);

    Optional<LocalUser> findByEmail(String email);
}
