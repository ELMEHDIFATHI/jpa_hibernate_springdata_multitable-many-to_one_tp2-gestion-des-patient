package com.example.orm_springdata_jpa_hibernate_multitable.Reposetories;

import com.example.orm_springdata_jpa_hibernate_multitable.models.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepo extends JpaRepository<Consultation,Long> {
}
