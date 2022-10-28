package com.projeto.hexagonal.application.config;

import com.projeto.hexagonal.application.infrastructure.PetRepositoryJDBI;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.spi.JdbiPlugin;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;
import java.util.List;

@Configuration
public class JdbiConfiguration {
    // instanciando jdbi como ponto de acesso à api jdbi.

    @Bean
    public Jdbi jdbi(DataSource ds, List<JdbiPlugin> jdbiPlugins, List<RowMapper<?>> rowMappers) {
        TransactionAwareDataSourceProxy dataSourceProxy = new TransactionAwareDataSourceProxy(ds);
        Jdbi jdbi = Jdbi.create(dataSourceProxy);
        jdbiPlugins.forEach(jdbi::installPlugin);
        rowMappers.forEach(jdbi::registerRowMapper);
        return jdbi;
    }

    @Bean
    public JdbiPlugin sqlObjectPlugin() {
        return new SqlObjectPlugin();
    }

    // instanciando o objeto para poder usá-lo na aplicação
    @Bean
    public PetRepositoryJDBI petRepositoryJDBI(Jdbi jdbi) {
        return jdbi.onDemand(PetRepositoryJDBI.class);
    }
}
