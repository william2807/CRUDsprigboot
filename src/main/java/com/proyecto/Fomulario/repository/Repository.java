
package com.proyecto.Fomulario.repository;

import com.proyecto.Fomulario.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
                          /*2*/
                          /*clase de la cual se persistir// dato primitivo id de la clase*/
public interface Repository extends JpaRepository<Usuario, Long>{
    
}
