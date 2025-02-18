package br.com.eddjava.api.config;

import br.com.eddjava.api.domain.User;
import br.com.eddjava.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public CommandLineRunner startDB() {
        return args -> {
            System.out.println("Usuários inseridos: ");
            User u1 = new User(null, "Eddward", "eddward@gmail.com", "123");
            User u2 = new User(null, "Messias", "messias@gmail.com", "123");
            repository.saveAll(List.of(u1, u2));
            repository.flush();
            System.out.println("Usuários inseridos: " + repository.count());
        };
    }
}
