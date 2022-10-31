package com.projeto.hexagonal.application.service;

import com.projeto.hexagonal.application.infrastructure.AtualizarPetRepository;
import com.projeto.hexagonal.application.mapper.BuscarPorIdPetMapper;
import com.projeto.hexagonal.application.presentation.request.AtualizarPetRequest;
import com.projeto.hexagonal.application.presentation.response.PetResponse;
import com.projeto.hexagonal.core.domain.Pet;
import com.projeto.hexagonal.core.ports.AtualizarPetService;
import com.projeto.hexagonal.core.ports.BuscarPetPorIdService;
import org.springframework.stereotype.Service;

@Service
public class AtualizarPetServiceImpl implements AtualizarPetService {

    private final AtualizarPetRepository atualizarPetRepository;
    private final BuscarPetPorIdService buscarPetPorIdService;

    public AtualizarPetServiceImpl(AtualizarPetRepository atualizarPetRepository, BuscarPetPorIdService buscarPetPorIdService) {
        this.atualizarPetRepository = atualizarPetRepository;
        this.buscarPetPorIdService = buscarPetPorIdService;
    }

    @Override
    public void atualizar(Long id, AtualizarPetRequest request) {
        PetResponse petResponse = buscarPetPorIdService.buscarPetPorId(id);
        Pet pet = BuscarPorIdPetMapper.toPet(petResponse);
        pet.setNome(request.getNome());
        pet.setResponsavel(request.getResponsavel());
        atualizarPetRepository.atualizar(pet);
    }
}
