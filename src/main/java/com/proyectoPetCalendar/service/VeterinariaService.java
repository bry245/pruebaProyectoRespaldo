package com.proyectoPetCalendar.service;

import com.proyectoPetCalendar.domain.Veterinaria;
import java.util.List;



public interface VeterinariaService {
    public List<Veterinaria> getVeterinarias(); 
    
    public Veterinaria getVeterinaria(Veterinaria usuario);
    
    public void save(Veterinaria usuario);
    
    public void delete(Veterinaria usuario);
}