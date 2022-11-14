
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
@Table(name="usuario")

public class Usuario implements Serializable {
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Long idUsuario;
    private String nombre;
    private String apellidos;
    private String correo;
    private String contraseña;
    private String telefono;

    public Usuario(String nombre, String apellidos, String correo, String contraseña, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
    }

    public Usuario() {
    }

    
    
    
    
    
}
