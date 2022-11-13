
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
@Table(name="mascota")
public class Mascota implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_mascota")
    private Long idMascota;
    private String nombrePropietario;
    private String apellidosPropietario;
    private int cedula;
    private String telefono;
    private String direccion;
    private String nombreMascota;
    private String edad;
    private String tipo;

    public Mascota() {
    }

    public Mascota(String nombrePropietario, String apellidosPropietario, int cedula, String telefono, String direccion, String nombreMascota, String edad, String tipo) {
        this.nombrePropietario = nombrePropietario;
        this.apellidosPropietario = apellidosPropietario;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombreMascota = nombreMascota;
        this.edad = edad;
        this.tipo = tipo;
    }
    
    
}
