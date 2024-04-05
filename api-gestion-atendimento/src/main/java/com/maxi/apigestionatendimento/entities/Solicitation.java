package com.maxi.apigestionatendimento.entities;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.maxi.apigestionatendimento.entities.enums.Priority;
import com.maxi.apigestionatendimento.entities.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "solicitations")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Solicitation implements Serializable{

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate createDate = LocalDate.now();

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate endDate;
    private Priority priority;
    private Status status;
    private String title;
    private String observation;

    @ManyToOne
    @JoinColumn(name = "tecnic_id")
    private Technic technic;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Solicitation(Integer id, Priority priority, Status status, String title, String observation, Technic technic,
            Client client) {
        this.id = id;
        this.priority = priority;
        this.status = status;
        this.title = title;
        this.observation = observation;
        this.technic = technic;
        this.client = client;
    }

    
}
