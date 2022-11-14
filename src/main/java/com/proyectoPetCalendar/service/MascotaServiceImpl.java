
package com.proyectoPetCalendar.service;

import com.proyectoPetCalendar.dao.MascotaDao;
import com.proyectoPetCalendar.domain.Mascota;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MascotaServiceImpl  implements MascotaService {

    @Autowired
    MascotaDao mascotaDao;

    @Override
    @Transactional (readOnly=true)
    public List<Mascota> getMascotas() {
        var Lista=(List<Mascota>) mascotaDao.findAll();
        return Lista;
    }

    @Override
    @Transactional (readOnly=true)
    public Mascota getMascota(Mascota mascota) {
        return mascotaDao.findById(mascota.getIdMascota()).orElse(null);
        
    }

    @Override
    @Transactional
    public void save(Mascota mascota) {
       mascotaDao.save(mascota);
    }

    @Override
    @Transactional
    public void delete(Mascota mascota) {
        mascotaDao.delete(mascota);
    }
    
}
