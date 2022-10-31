package com.projeto.hexagonal.application.service;

import com.projeto.hexagonal.application.infrastructure.DeletarPetPorIdRepository;
import com.projeto.hexagonal.core.ports.DeletarPetPorIdService;
import org.springframework.stereotype.Service;

@Service
public class DeletarPetPorIdServiceImpl implements DeletarPetPorIdService {
    private final DeletarPetPorIdRepository deletarPetPorIdRepository;

    public DeletarPetPorIdServiceImpl(DeletarPetPorIdRepository deletarPetPorIdRepository) {
        this.deletarPetPorIdRepository = deletarPetPorIdRepository;
    }

    @Override
    public void deletarPetPorId(Long id) {
        deletarPetPorIdRepository.deletarPetPorId(id);
    }
}
