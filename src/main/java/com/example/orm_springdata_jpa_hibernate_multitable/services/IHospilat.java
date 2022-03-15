package com.example.orm_springdata_jpa_hibernate_multitable.services;

import com.example.orm_springdata_jpa_hibernate_multitable.models.Consultation;
import com.example.orm_springdata_jpa_hibernate_multitable.models.Medecin;
import com.example.orm_springdata_jpa_hibernate_multitable.models.Patient;
import com.example.orm_springdata_jpa_hibernate_multitable.models.Rendezvous;

public interface IHospilat {

    Patient savePatient (Patient patient);
    Medecin saveMedecin(Medecin medecin);
    Rendezvous saveRDV(Rendezvous rendezVous);
    Consultation saveVonsultation (Consultation consultation);
}
