package com.example.orm_springdata_jpa_hibernate_multitable;

import com.example.orm_springdata_jpa_hibernate_multitable.Reposetories.ConsultationRepo;
import com.example.orm_springdata_jpa_hibernate_multitable.Reposetories.MedcinRepo;
import com.example.orm_springdata_jpa_hibernate_multitable.Reposetories.PatientRepo;
import com.example.orm_springdata_jpa_hibernate_multitable.Reposetories.RendezvousRepo;
import com.example.orm_springdata_jpa_hibernate_multitable.models.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class OrmSpringdataJpaHibernateMultitableApplication  {

    public static void main(String[] args) {
        SpringApplication.run(OrmSpringdataJpaHibernateMultitableApplication.class, args);
    }

    @Bean
    //PatientRepo Pr, MedcinRepo Mr, RendezvousRepo Rv, ConsultationRepo CR
    CommandLineRunner start(HospilatServiceImple H,PatientRepo Pr, MedcinRepo Mr, RendezvousRepo Rv, ConsultationRepo CR){
      return args ->{
          Stream.of("Mohamed","Hassan","Najat").forEach(name->{
              Patient patient=new Patient();
              patient.setNom(name);
              patient.setDateNaissance(new Date());
              patient.setMalade(false);
              H.savePatient(patient);
          });
          Stream.of("Mehdi","PR.Mohamed","Mounia").forEach(name->{
              Medecin M=new Medecin();
              M.setNom(name);
              M.setEmail(name +"@gmail.com");
              M.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
              H.saveMedecin(M);
          });

          Patient patient=Pr.findById(8l).orElse(null);
          Medecin medcin=Mr.findById(1l).orElse(null);

       //Patient patient1=Pr.findByNom("mohamed");

          //Medecin medcin=Mr.findByNom("Mounia");


          Rendezvous rendezVous=new Rendezvous();
          rendezVous.setDate(new Date());
          rendezVous.setRdv(StatusRdv.PENDING);
          rendezVous.setMedecin(medcin);
          rendezVous.setPatient(patient);
          H.saveRDV(rendezVous);

          Rendezvous rendezVous1=Rv.findById(1L).orElse( null);
          Consultation consultation=new Consultation();
          consultation.setDateConsultation(new Date());
          consultation.setRendezvous(rendezVous1);
          consultation. setRapport("Rapport de la consultion ....F");
          H.saveVonsultation(consultation);


      };


    }

}
