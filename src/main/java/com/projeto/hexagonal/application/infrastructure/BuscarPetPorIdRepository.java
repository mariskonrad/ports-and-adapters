package com.projeto.hexagonal.application.infrastructure;

import com.projeto.hexagonal.core.domain.Pet;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

@UseClasspathSqlLocator
public interface BuscarPetPorIdRepository {

    @SqlQuery
    Pet buscarPetPorId(Long id);
}
