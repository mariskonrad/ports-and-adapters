package com.projeto.hexagonal.application.service;

import com.projeto.hexagonal.application.infrastructure.ListarPetRepository;
import com.projeto.hexagonal.application.mapper.ListarPetMapper;
import com.projeto.hexagonal.application.presentation.response.PetResponse;
import com.projeto.hexagonal.core.domain.Pet;
import com.projeto.hexagonal.core.ports.ListarPetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarPetServiceImpl implements ListarPetService {

    private final ListarPetRepository listarPetRepository;

    public ListarPetServiceImpl(ListarPetRepository listarPetRepository) {
        this.listarPetRepository = listarPetRepository;
    }

    @Override
    public List<PetResponse> listarPets() {
        List<Pet> pets = listarPetRepository.listarPets();
        return pets.stream().map(pet -> ListarPetMapper.toResponse(pet)).collect(Collectors.toList());
    }
}
