package com.maxi.apigestionatendimento.entities;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.maxi.apigestionatendimento.entities.enums.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public abstract class LocalUser implements Serializable {

    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    protected String name;

    @Column(unique = true)
    protected String cpf;

    @Column(unique = true)
    protected String email;
    protected String password;

    protected UserRole role;
    
    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dataCadastro = LocalDate.now();

}
