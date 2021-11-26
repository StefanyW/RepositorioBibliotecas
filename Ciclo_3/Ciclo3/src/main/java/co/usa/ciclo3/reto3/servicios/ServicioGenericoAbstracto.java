/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.servicios;

import co.usa.ciclo3.reto3.repositorios.RepositorioGenericoAbstracto;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author StefanyW
 * 
 */

public abstract class ServicioGenericoAbstracto <T, ID extends Serializable>{
    
    public abstract RepositorioGenericoAbstracto <T, ID> getRepository();
    
    public abstract T guardar(T objeto);
    
    public abstract T actualizar (T objeto);
    
    public List<T> obtenerTodos(){
        return getRepository().obtenerTodos();    
    }
    
    public Optional<T> obtenerPorId(ID id){
        return getRepository().obtenerPorId(id);    
    }
    
    public boolean eliminar(ID id){
        return obtenerPorId(id).map(t -> {
            getRepository().eliminar(id);
            return true;
        }).orElse(false);
    }
    
}
