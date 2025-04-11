package com.Proyecto.Personal.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Table(name = "Pais")
@Data
@Entity
public class Pais implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String nombre;

}


