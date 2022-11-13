package com.proyectoPetCalendar.dao;

import com.proyectoPetCalendar.domain.Voluntario;
import org.springframework.data.repository.CrudRepository;


public interface VoluntariosDao extends CrudRepository <Voluntario, Long> {
    
}