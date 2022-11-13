package com.proyectoPetCalendar.dao;

import com.proyectoPetCalendar.domain.Mascota;
import org.springframework.data.repository.CrudRepository;


public interface MascotaDao extends CrudRepository <Mascota, Long> {
    
}
