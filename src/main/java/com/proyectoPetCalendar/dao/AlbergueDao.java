package com.proyectoPetCalendar.dao;

import com.proyectoPetCalendar.domain.Albergue;
import org.springframework.data.repository.CrudRepository;


public interface AlbergueDao extends CrudRepository <Albergue, Long> {
    
}
