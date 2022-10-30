package com.projeto.hexagonal.application.service;

import com.projeto.hexagonal.application.infrastructure.ListarPetRepository;
import com.projeto.hexagonal.core.domain.Pet;
import com.projeto.hexagonal.core.ports.ListarPetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarPetServiceImpl implements ListarPetService {

    private final ListarPetRepository listarPetRepository;

    public ListarPetServiceImpl(ListarPetRepository listarPetRepository) {
        this.listarPetRepository = listarPetRepository;
    }

    @Override
    public List<Pet> listarPets() {
        return listarPetRepository.listarPets();
    }
}
