package com.Proyecto.Personal.Respository;

import com.Proyecto.Personal.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
