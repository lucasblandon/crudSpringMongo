package com.lb.crudmongo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lb.crudmongo.models.EnvioDTO;
import com.lb.crudmongo.repositories.IEnvioDAO;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
        RequestMethod.DELETE })
@RequestMapping("/api/envios")

public class EnvioController {
    @Autowired
    private IEnvioDAO repository;

    @PostMapping("/envio")
    public EnvioDTO create(@Validated @RequestBody EnvioDTO p) {
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<EnvioDTO> readAll() {
        return repository.findAll();
    }

    @PutMapping("/envio/{id}")
    public EnvioDTO update(@PathVariable String id, @Validated @RequestBody EnvioDTO p) {
        return repository.save(p);
    }

    @DeleteMapping("/envio/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }

}


