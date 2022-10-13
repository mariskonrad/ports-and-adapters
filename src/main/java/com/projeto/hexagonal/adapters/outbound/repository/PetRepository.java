package com.projeto.hexagonal.adapters.outbound.repository;

import com.projeto.hexagonal.adapters.inbound.entity.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<PetEntity, Long> {
}
