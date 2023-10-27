package com.proyecto.Fomulario.controlador;

import com.proyecto.Fomulario.modelo.Usuario;
import com.proyecto.Fomulario.repository.Repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/*3*/
/*tipo de comunicacion rest*/
@RestController
public class controlador {
    
    @Autowired
    private Repository repositorio;
    
    /*sitio a donde se va a exponer el servicio*/
    @GetMapping()
    public String index(){
        return "CONECTADO";
    }
    
    @GetMapping("/Usuarios")
    public List<Usuario> getUsuarios(){
        /*nos trae la lista de usuarios*/
        return repositorio.findAll();
    }
    
    @PostMapping("/Guardar")
    /*usado para volver la peticion de formato json al objeto(usuario)*/
    public String Guardar(@RequestBody Usuario usuario){
        repositorio.save(usuario);
        return "Guardado";
    }
    
    @PutMapping("/Editar/{id}")
    public String actualizar(@PathVariable Long id, @RequestBody Usuario usuario){
        
        /**/
        Usuario actualizarUsuario = repositorio.findById(id).get();
        
        actualizarUsuario.setNombres(usuario.getNombres());
        actualizarUsuario.setApellidos(usuario.getApellidos());
        actualizarUsuario.setDocumento(usuario.getDocumento());
        actualizarUsuario.setCorreo_electronico(usuario.getCorreo_electronico());
        actualizarUsuario.setTarjeta_sitp(usuario.getTarjeta_sitp());
        actualizarUsuario.setTelefono(usuario.getTelefono());

        repositorio.save(actualizarUsuario);
        
        return "Editado correctamente";
    }
    
    @DeleteMapping("/Eliminar/{id}")
    public String actualizar(@PathVariable Long id){
        Usuario eliminarUsuario = repositorio.findById(id).get();
        repositorio.delete(eliminarUsuario);
        return "eliminado correctamente";
    }
}
