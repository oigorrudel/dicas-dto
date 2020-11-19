package br.xksoberbado.dicasdto.mock;

import br.xksoberbado.dicasdto.model.Gender;
import br.xksoberbado.dicasdto.model.Person;
import br.xksoberbado.dicasdto.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Mock implements ApplicationRunner {

    @Autowired
    private PersonRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        repository.save(new Person("João", "da Silva", Gender.MALE));
        repository.save(new Person("Maria", "da Silveira", Gender.FEMALE));
    }
}
