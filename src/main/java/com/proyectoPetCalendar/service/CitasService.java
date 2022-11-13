package com.proyectoPetCalendar.service;

import com.proyectoPetCalendar.domain.Citas;
import java.util.List;

import java.util.List;


public interface CitasService {
    public List<Citas> getCitass(); 
    
    public Citas getCitas(Citas citas);
    
    public void save(Citas citas);
    
    public void delete(Citas citas);
}