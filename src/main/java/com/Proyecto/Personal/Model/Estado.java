package com.Proyecto.Personal.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Table(name = "Estado")
@Data
@Entity
public class Estado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;

    public String nombre;
}


