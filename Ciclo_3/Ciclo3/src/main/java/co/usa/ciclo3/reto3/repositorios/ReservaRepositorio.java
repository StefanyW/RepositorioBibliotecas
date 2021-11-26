/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.repositorios;

import co.usa.ciclo3.reto3.modelo.Reservas;
import co.usa.ciclo3.reto3.repositorios.Interfaces.ReservasInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author StefanyW
 */
@Repository
public class ReservaRepositorio extends RepositorioGenericoAbstracto<Reservas, Long>{
    
    @Autowired
    private ReservasInterfaces anInterfaces;

    @Override
    public CrudRepository<Reservas, Long> getDao() {
        return (CrudRepository<Reservas, Long>) anInterfaces;
    }
    
}
