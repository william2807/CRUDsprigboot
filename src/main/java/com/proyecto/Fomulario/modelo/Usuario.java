
package com.proyecto.Fomulario.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


/*1*/
/*entidad(tabla): se usa como identificador en la base de datos*/
@Entity
public class Usuario {

    /*el identificador principal(PK)*/
    @Id
    /*como se generara el id*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;
    
    @Column(name = "nombres")
    @Getter
    @Setter
    private String nombres;
    
    @Column(name = "apellidos")
    @Getter
    @Setter
    private String apellidos;
    
    @Column(name = "documento")
    @Getter
    @Setter
    private String documento;
    
    @Column(name = "correo_electronico")
    @Getter
    @Setter
    private String correo_electronico;
   
    @Column(name = "tarjeta_sitp")
    @Getter
    @Setter
    private String tarjeta_sitp;
    
    @Column(name = "telefono")
    @Getter
    @Setter
    private String telefono;
    
}

