package com.example.orm_springdata_jpa_hibernate_multitable.Controller;

import com.example.orm_springdata_jpa_hibernate_multitable.Reposetories.PatientRepo;
import com.example.orm_springdata_jpa_hibernate_multitable.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {


    @Autowired
    private PatientRepo patientRepository;

    @GetMapping("/patients")
    public List<Patient> patientlist() {
        return patientRepository.findAll();
    }

}
