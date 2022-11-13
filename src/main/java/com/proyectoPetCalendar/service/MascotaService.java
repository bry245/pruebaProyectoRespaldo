package com.proyectoPetCalendar.service;

import com.proyectoPetCalendar.domain.Mascota;
import java.util.List;


public interface MascotaService {
    public List<Mascota> getMascotas(); 
    
    public Mascota getMascota(Mascota mascota);
    
    public void save(Mascota mascota);
    
    public void delete(Mascota mascota);
}