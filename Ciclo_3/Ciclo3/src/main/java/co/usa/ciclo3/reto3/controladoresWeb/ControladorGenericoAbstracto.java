/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.controladoresWeb;

import co.usa.ciclo3.reto3.servicios.ServicioGenericoAbstracto;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author StefanyW
 *
 */

public abstract class ControladorGenericoAbstracto <T, ID extends Serializable> {
    
    public abstract ServicioGenericoAbstracto<T, ID> getService ();
    
    @GetMapping("/all")
    public List<T>obtenerTodos(T entidad){
        return getService().obtenerTodos();
    }
    
    @GetMapping("/id")
    public Optional<T>obtenerPorId(@PathVariable ("id")ID id){
        return getService().obtenerPorId(id);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public T guardar(@RequestBody T entidad){
        return getService().guardar(entidad);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public T actualizar (@RequestBody T entidad){
        return  getService().actualizar(entidad);
    }
    
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean eliminar (@PathVariable("id")ID id){
        return getService().eliminar(id);   
    }
    
    
    
    
    
         
    
    
}
