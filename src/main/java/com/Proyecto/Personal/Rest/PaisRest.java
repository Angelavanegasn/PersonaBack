package com.Proyecto.Personal.Rest;

import com.Proyecto.Personal.Model.Pais;
import com.Proyecto.Personal.Service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pais/")
public class PaisRest {

    @Autowired
    private PaisService paisService;

    @GetMapping
    private ResponseEntity<List<Pais>> getAllpaises() {
        return ResponseEntity.ok(paisService.findAll());
    }
}
