package br.xksoberbado.dicasdto.service;

import br.xksoberbado.dicasdto.model.Person;
import br.xksoberbado.dicasdto.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Optional<Person> findById(Long id) {
        return repository.findById(id);
    }

    public Collection<Person> findAll() {
        return repository.findAll();
    }

}
