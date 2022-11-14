
package com.proyectoPetCalendar.service;

import com.proyectoPetCalendar.dao.VoluntariosDao;
import com.proyectoPetCalendar.domain.Voluntario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VoluntariosServiceImpl implements VoluntarioService{

    
    @Autowired
    private VoluntariosDao voluntarioDao;
    @Override
    @Transactional (readOnly=true)
    public List<Voluntario> getVoluntarios() {
        return(List<Voluntario>) voluntarioDao.findAll();
    }

    @Override
    @Transactional (readOnly=true)
    public Voluntario getVoluntario(Voluntario voluntario) {
     return voluntarioDao.findById(voluntario.getIdVoluntario()).orElse(null);
    }

    @Override
    public void save(Voluntario voluntario) {
     voluntarioDao.save(voluntario);
    }

    @Override
    public void delete(Voluntario voluntario) {
     voluntarioDao.delete(voluntario);
    }
    
}
