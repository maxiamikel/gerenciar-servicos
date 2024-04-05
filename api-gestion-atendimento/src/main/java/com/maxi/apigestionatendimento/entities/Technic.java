package com.maxi.apigestionatendimento.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tecnics")
public class Technic  extends LocalUser{

    private static final long serialVersionUID=1L;

    
    @JsonIgnore
    @OneToMany(mappedBy = "technic")
    private List<Solicitation> solicitations = new ArrayList<>() ;
    
}
