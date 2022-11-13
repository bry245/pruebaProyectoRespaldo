package com.proyectoPetCalendar.dao;

import com.proyectoPetCalendar.domain.Veterinaria;
import org.springframework.data.repository.CrudRepository;


public interface VeterinariaDao extends CrudRepository <Veterinaria, Long> {
    
}
