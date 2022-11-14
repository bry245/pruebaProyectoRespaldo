package com.proyectoPetCalendar.service;

import com.proyectoPetCalendar.domain.Veterinaria;
import java.util.List;



public interface VeterinariaService {
    public List<Veterinaria> getVeterinarias(); 
    
    public Veterinaria getVeterinaria(Veterinaria veterinaria);
    
    public void save(Veterinaria veterinaria);
    
    public void delete(Veterinaria veterinaria);
}