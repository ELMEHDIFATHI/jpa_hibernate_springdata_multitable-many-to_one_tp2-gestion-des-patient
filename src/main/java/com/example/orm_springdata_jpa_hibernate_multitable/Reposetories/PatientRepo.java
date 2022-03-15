package com.example.orm_springdata_jpa_hibernate_multitable.Reposetories;

import com.example.orm_springdata_jpa_hibernate_multitable.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);

}
