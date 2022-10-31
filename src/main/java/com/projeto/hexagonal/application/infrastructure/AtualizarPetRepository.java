package com.projeto.hexagonal.application.infrastructure;

import com.projeto.hexagonal.core.domain.Pet;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import javax.validation.Valid;

@UseClasspathSqlLocator
public interface AtualizarPetRepository {

    @SqlUpdate
    void atualizar(@BindBean @Valid Pet pet);
}
