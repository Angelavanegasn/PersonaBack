package com.Proyecto.Personal.Rest;

import com.Proyecto.Personal.Model.Persona;
import com.Proyecto.Personal.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/persona/")
public class PersonaRest {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public ResponseEntity<List<Persona>> getAllPersona() {
        return ResponseEntity.ok(personaService.findAll());
    }

    @PostMapping
    private ResponseEntity<Persona> getSavePersona(@RequestBody Persona persona) {
        try {
            Persona personaGuardada = personaService.save(persona);
            return ResponseEntity.created(new URI("/persona/" + personaGuardada.getId())).body(personaGuardada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        }
    }
