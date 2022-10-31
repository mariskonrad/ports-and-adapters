package com.projeto.hexagonal.application.infrastructure;

import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

@UseClasspathSqlLocator
public interface DeletarPetPorIdRepository {

    @SqlUpdate
    Integer deletarPetPorId(Long id);
}
