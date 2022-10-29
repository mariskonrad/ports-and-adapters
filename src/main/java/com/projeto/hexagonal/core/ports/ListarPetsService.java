package com.projeto.hexagonal.core.ports;

import java.awt.print.Pageable;
import java.util.List;

public interface ListarPetsService {
    List<Pageable> listarPets(Pageable pageable);
}
