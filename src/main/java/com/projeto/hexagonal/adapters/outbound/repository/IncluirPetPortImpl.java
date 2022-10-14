package com.projeto.hexagonal.adapters.outbound.repository;

import com.projeto.hexagonal.adapters.inbound.entity.PetEntity;
import com.projeto.hexagonal.application.core.domain.Pet;
import com.projeto.hexagonal.application.ports.out.IncluirPetPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import static com.projeto.hexagonal.adapters.inbound.mapper.IncluirPetMapper.toEntity;
import static com.projeto.hexagonal.adapters.inbound.mapper.IncluirPetMapper.toPet;

@Service
public class IncluirPetPortImpl implements IncluirPetPort {

    @Autowired
    private PetRepository petRepository;

    @Override
    public Pet incluir(Pet pet) {
        PetEntity petEntity = toEntity(pet);
        petEntity.setDataInclusao(LocalDateTime.now());
        return toPet(petRepository.save(petEntity));
    }
}
