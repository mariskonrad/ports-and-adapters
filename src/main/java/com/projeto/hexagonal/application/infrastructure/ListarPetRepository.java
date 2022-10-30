package com.projeto.hexagonal.application.infrastructure;

import com.projeto.hexagonal.core.domain.Pet;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@UseClasspathSqlLocator
public interface ListarPetRepository {

    @SqlQuery
    List<Pet> listarPets();
}
