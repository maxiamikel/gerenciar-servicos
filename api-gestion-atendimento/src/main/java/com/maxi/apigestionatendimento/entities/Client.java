package com.maxi.apigestionatendimento.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.maxi.apigestionatendimento.entities.enums.UserRole;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clients")
@Getter
@Setter
public class Client  extends LocalUser{

    private static final long serialVersionUID=1L;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<Solicitation> solicitations =  new ArrayList<>();

    public Client(Integer id, String name, String cpf, String email, String password, UserRole role,
            LocalDate dataCadastro) {
        super(id, name, cpf, email, password, role, dataCadastro);
    }

    public Client() {
        super();
    }

    
}
