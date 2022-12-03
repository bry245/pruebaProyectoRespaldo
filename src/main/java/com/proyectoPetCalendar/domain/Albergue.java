
package com.proyectoPetCalendar.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="albergue")
public class Albergue implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_albergue") 
    private Long idAlbergue;
    private String descripcion;
    private String ubicacion;
    private String cuenta;

    public Albergue() {
    }

    public Albergue( String descripcion, String ubicacion, String cuenta) {
        
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.cuenta = cuenta;
    }
}
