package com.Proyecto.Personal.Model;


import jakarta.persistence.*;
import lombok.Data;

@Table(name = "persona")
@Data
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String apellido;
    private int edad;

    @ManyToOne
    @JoinColumn(name = "id_pais", nullable = false)
    private Pais pais;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    private Estado estado;
}


