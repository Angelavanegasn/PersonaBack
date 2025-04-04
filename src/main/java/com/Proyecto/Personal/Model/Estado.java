package com.Proyecto.Personal.Model;


import jakarta.persistence.*;
import lombok.Data;

@Table(name = "Estado")
@Data
@Entity
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;

    public String nombre;
}


