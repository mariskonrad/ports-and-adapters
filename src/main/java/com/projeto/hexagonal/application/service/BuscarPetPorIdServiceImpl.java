package com.projeto.hexagonal.application.service;

import com.projeto.hexagonal.application.infrastructure.BuscarPetPorIdRepository;
import com.projeto.hexagonal.application.mapper.BuscarPorIdPetMapper;
import com.projeto.hexagonal.application.presentation.response.PetResponse;
import com.projeto.hexagonal.core.domain.Pet;
import com.projeto.hexagonal.core.ports.BuscarPetPorIdService;
import org.springframework.stereotype.Service;

@Service
public class BuscarPetPorIdServiceImpl implements BuscarPetPorIdService {

    private final BuscarPetPorIdRepository buscarPetPorIdRepository;

    public BuscarPetPorIdServiceImpl(BuscarPetPorIdRepository buscarPetPorIdRepository) {
        this.buscarPetPorIdRepository = buscarPetPorIdRepository;
    }

    @Override
    public PetResponse buscarPetPorId(Long id) {
        Pet pet = buscarPetPorIdRepository.buscarPetPorId(id);
        return BuscarPorIdPetMapper.toResponse(pet);
    }
}
