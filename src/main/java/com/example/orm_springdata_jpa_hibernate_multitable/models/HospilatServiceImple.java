package com.example.orm_springdata_jpa_hibernate_multitable.models;

import com.example.orm_springdata_jpa_hibernate_multitable.Reposetories.ConsultationRepo;
import com.example.orm_springdata_jpa_hibernate_multitable.Reposetories.MedcinRepo;
import com.example.orm_springdata_jpa_hibernate_multitable.Reposetories.PatientRepo;
import com.example.orm_springdata_jpa_hibernate_multitable.Reposetories.RendezvousRepo;
import com.example.orm_springdata_jpa_hibernate_multitable.services.IHospilat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional

public class HospilatServiceImple implements IHospilat {


    @Autowired
    private PatientRepo PR;
    private MedcinRepo MR;
    private RendezvousRepo RV;
    private ConsultationRepo CR;

    public HospilatServiceImple(PatientRepo PR, MedcinRepo MR, RendezvousRepo RV, ConsultationRepo CR) {
        this.PR = PR;
        this.MR = MR;
        this.RV = RV;
        this.CR = CR;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return PR.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return MR.save(medecin);
    }

    @Override
    public Rendezvous saveRDV(Rendezvous rendezVous) {
       // rendezVous.setId(UUID.randqmUUID().toString()); chaine aleratoir unique

        return RV.save(rendezVous);
    }

    @Override
    public Consultation saveVonsultation(Consultation consultation) {
        return CR.save(consultation);
    }
}
