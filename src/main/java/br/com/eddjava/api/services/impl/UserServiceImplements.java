package br.com.eddjava.api.services.impl;

import br.com.eddjava.api.domain.User;
import br.com.eddjava.api.repositories.UserRepository;
import br.com.eddjava.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplements implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {

        Optional<User> obj = repository.findById(id);
//        System.out.println(obj);
//        System.out.println("TO NO IMPLEMENTS");
//        System.out.println(id);
//        return obj.orElse(null);

        if (obj.isPresent()) {
            System.out.println("Encontrou o objeto: " + obj.get());
        } else {
            System.out.println("Nenhum objeto encontrado para o id: " + id);
        }

        System.out.println("TO NO IMPLEMENTS");
        System.out.println("ID: " + id);
        return obj.orElse(null);

    }
}
