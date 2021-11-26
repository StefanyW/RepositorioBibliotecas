/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.repositorios;

import co.usa.ciclo3.reto3.modelo.Mensajes;
import co.usa.ciclo3.reto3.repositorios.Interfaces.MensajesInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author StefanyW
 */
@Repository
public class MensajeRepositorio extends RepositorioGenericoAbstracto<Mensajes, Long>{
    
    @Autowired
    private MensajesInterfaces anInterfaces;

    @Override
    public CrudRepository<Mensajes, Long> getDao() {
        return (CrudRepository<Mensajes, Long>) anInterfaces;
    }
    
}
