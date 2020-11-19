package br.xksoberbado.dicasdto.controller;

import br.xksoberbado.dicasdto.dto.PersonDTO;
import br.xksoberbado.dicasdto.dto.PersonDTO2;
import br.xksoberbado.dicasdto.dto.PersonDTO3;
import br.xksoberbado.dicasdto.service.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private PersonService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(person -> ResponseEntity.ok(mapper.map(person, PersonDTO.class)))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/list-one")
    public ResponseEntity<?> listOne() {
        return ResponseEntity.ok(service.findAll().stream().map(p -> mapper.map(p, PersonDTO2.class)).collect(Collectors.toList()));
    }

    @GetMapping("/list-two")
    public ResponseEntity<?> listTwo() {
        return ResponseEntity.ok(service.findAll().stream().map(p -> mapper.map(p, PersonDTO3.class)).collect(Collectors.toList()));
    }

}
