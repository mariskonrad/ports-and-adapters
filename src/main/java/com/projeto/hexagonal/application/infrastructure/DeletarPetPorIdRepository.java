package com.projeto.hexagonal.application.infrastructure;

import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

@UseClasspathSqlLocator
public interface DeletarPetPorIdRepository {

    @SqlQuery
    Long deletarPetPorId(Long id);
}
