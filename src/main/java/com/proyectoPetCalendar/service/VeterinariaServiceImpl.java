
package com.proyectoPetCalendar.service;

import com.proyectoPetCalendar.dao.VeterinariaDao;
import com.proyectoPetCalendar.domain.Veterinaria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VeterinariaServiceImpl implements VeterinariaService {

    @Autowired
    private VeterinariaDao veterinariaDao;
    
    @Override
    @Transactional (readOnly=true)
    public List<Veterinaria> getVeterinarias() {
       return(List<Veterinaria>) veterinariaDao.findAll(); 
    }

    @Override
    @Transactional (readOnly=true)
    public Veterinaria getVeterinaria(Veterinaria veterinaria) {
    return veterinariaDao.findById(veterinaria.getIdVeterinaria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Veterinaria veterinaria) {
        veterinariaDao.save(veterinaria);
    }

    @Override
    @Transactional
    public void delete(Veterinaria veterinaria) {
    veterinariaDao.delete(veterinaria);
    }
    
}
