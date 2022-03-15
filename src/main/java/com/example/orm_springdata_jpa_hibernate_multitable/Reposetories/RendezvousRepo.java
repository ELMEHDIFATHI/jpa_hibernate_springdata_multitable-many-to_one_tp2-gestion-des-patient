package com.example.orm_springdata_jpa_hibernate_multitable.Reposetories;

import com.example.orm_springdata_jpa_hibernate_multitable.models.Rendezvous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezvousRepo extends JpaRepository<Rendezvous,Long> {
}
