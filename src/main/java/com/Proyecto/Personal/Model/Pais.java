package com.Proyecto.Personal.Model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "Pais")
@Data
@Entity
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String nombre;

}


