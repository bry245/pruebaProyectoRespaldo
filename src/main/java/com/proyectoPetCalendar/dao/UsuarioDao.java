package com.proyectoPetCalendar.dao;

import com.proyectoPetCalendar.domain.Usuario;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioDao extends CrudRepository <Usuario, Long> {
    
}