
package com.proyectoPetCalendar.controller;

import com.proyectoPetCalendar.service.MascotaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;





@Slf4j
@Controller
public class MascotasController {
    
    @Autowired 
   private MascotaService mascotaService;
    
    @GetMapping("/mascotas/menu")
    public String menu(Model model){
        
        
        return"/mascotas/menu";
    }
   
    
    @GetMapping("/mascotas/listado")
    public String inicio(Model model) {
        var mascotas = mascotaService.getMascotas();/*Metodo del crud que devulve todos los articulos*/
        
        model.addAttribute("mascotas", mascotas);
      
        return "/mascotas/listado";
    
}


}
