package com.proyectoPetCalendar.service;

import com.proyectoPetCalendar.domain.Voluntario;
import java.util.List;


public interface VoluntarioService {
    public List<Voluntario> getVoluntarios(); 
    
    public Voluntario getVoluntario(Voluntario voluntario);
    
    public void save(Voluntario voluntario);
    
    public void delete(Voluntario voluntario);
}
