package com.projeto.hexagonal.application.infrastructure;

import com.projeto.hexagonal.core.domain.Pet;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

// essa anotation vai buscar o sql que foi escrito dentro de um arquivo que fica no mesmo caminho que este porém na pasta resources.
@UseClasspathSqlLocator
public interface IncluirPetRepository {

    @SqlUpdate
    @GetGeneratedKeys
    Long incluirNovoPet(@BindBean Pet pet);
}
