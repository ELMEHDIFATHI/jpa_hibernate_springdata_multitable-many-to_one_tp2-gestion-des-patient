package com.example.orm_springdata_jpa_hibernate_multitable.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Rendezvous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @Enumerated(EnumType.ORDINAL)
    private StatusRdv rdv;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private  Medecin medecin;
    @OneToOne(mappedBy = "rendezvous")
    private  Consultation consultation;
}
