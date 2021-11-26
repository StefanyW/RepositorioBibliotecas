/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.repositorios;

import co.usa.ciclo3.reto3.repositorios.Interfaces.InterfaceGenerica;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author StefanyW
 * @param <T>
 * @param <ID>
 * 
 */

public abstract class RepositorioGenericoAbstracto <T, ID extends  Serializable> implements InterfaceGenerica<T, ID>{
    public abstract CrudRepository<T, ID> getDao();
    
    @Override
    public List<T> obtenerTodos(){
        return (List<T>)getDao().findAll();    
    }
    
    @Override
    public Optional<T> obtenerPorId(ID id){
        return getDao().findById(id);
    }

    @Override
    public T guardar(T objeto) {
        return getDao().save(objeto);
    }

    @Override
    public void eliminar(ID id) {
        getDao().deleteById(id); 
    }  
}
