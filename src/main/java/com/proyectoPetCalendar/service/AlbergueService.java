package com.proyectoPetCalendar.service;

import com.proyectoPetCalendar.domain.Albergue;
import java.util.List;

import java.util.List;


public interface AlbergueService {
    public List<Albergue> getAlbergues(); 
    
    public Albergue getAlbergue(Albergue albergue);
    
    public void save(Albergue albergue);
    
    public void delete(Albergue albergue);
}
