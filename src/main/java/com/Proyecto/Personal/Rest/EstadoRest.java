package com.Proyecto.Personal.Rest;

import com.Proyecto.Personal.Model.Estado;
import com.Proyecto.Personal.Service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estado/")
public class EstadoRest {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("{id}")
    private ResponseEntity<List<Estado>> getAllEstadoByPais(@PathVariable("id") long idpais) {
        return ResponseEntity.ok(estadoService.findAllByCountry(idpais));
    }
}
