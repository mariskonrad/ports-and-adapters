package com.projeto.hexagonal.application.service;

import com.projeto.hexagonal.application.infrastructure.BuscarPetPorIdRepository;
import com.projeto.hexagonal.application.mapper.BuscarPorIdPetMapper;
import com.projeto.hexagonal.application.presentation.response.PetResponse;
import com.projeto.hexagonal.core.domain.Pet;
import com.projeto.hexagonal.core.ports.BuscarPetPorIdService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class BuscarPetPorIdServiceImpl implements BuscarPetPorIdService {

    private final BuscarPetPorIdRepository buscarPetPorIdRepository;

    public BuscarPetPorIdServiceImpl(BuscarPetPorIdRepository buscarPetPorIdRepository) {
        this.buscarPetPorIdRepository = buscarPetPorIdRepository;
    }

    @Override
    public PetResponse buscarPetPorId(Long id) {
        Optional<Pet> pet = Optional.ofNullable(Optional.ofNullable(buscarPetPorIdRepository.buscarPetPorId(id))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pet não encontrado")));

        return BuscarPorIdPetMapper.toResponse(BuscarPorIdPetMapper.optionalToPet(pet));
    }
}
