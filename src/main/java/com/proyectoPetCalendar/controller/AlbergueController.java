package com.proyectoPetCalendar.controller;

import com.proyectoPetCalendar.service.AlbergueService;
import com.proyectoPetCalendar.domain.Albergue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class AlbergueController {
    
    @Autowired //Crea instancia de forma automatica
    private AlbergueService albergueService;
    
    @GetMapping("/albergue/listado")
    public String inicio(Model model){        
        var albergues = albergueService.getAlbergues();
                
        model.addAttribute("albergues", albergues);
        return "/albergue/listado";
    }
}
