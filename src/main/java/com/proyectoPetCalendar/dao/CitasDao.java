package com.proyectoPetCalendar.dao;

import com.proyectoPetCalendar.domain.Citas;
import org.springframework.data.repository.CrudRepository;


public interface CitasDao extends CrudRepository <Citas, Long> {
    
}
