package com.example.orm_springdata_jpa_hibernate_multitable.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  Long id;
    private Date dateConsultation;
    private String rapport;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToOne
    private Rendezvous rendezvous;
}
