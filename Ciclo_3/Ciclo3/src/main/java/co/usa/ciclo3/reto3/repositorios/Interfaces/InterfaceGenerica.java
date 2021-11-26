/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.repositorios.Interfaces;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author StefanyW
 */
public interface InterfaceGenerica <T, ID extends Serializable>{
    
    List<T> obtenerTodos();
    
    Optional<T> obtenerPorId(ID id);
    
    T guardar (T objeto);
    
    void eliminar(ID id); 
    
    
}
