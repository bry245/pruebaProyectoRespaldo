package com.proyectoPetCalendar.service;


import com.proyectoPetCalendar.dao.AlbergueDao;
import com.proyectoPetCalendar.domain.Albergue;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AlbergueServiceImpl implements AlbergueService {
    
    @Autowired
    AlbergueDao albergueDao;

    @Override
    public List<Albergue> getAlbergues() { //false
        var lista = (List<Albergue>) albergueDao.findAll();
        return lista;
    }

    @Override
    public Albergue getAlbergue(Albergue albergue) { 
        return albergueDao.findById(albergue.getIdAlbergue()).orElse(null);
    }

    @Override
    public void save(Albergue albergue) {
        albergueDao.save(albergue);    
    }

    @Override
    public void delete(Albergue albergue) {
        albergueDao.delete(albergue);
    }  
}
