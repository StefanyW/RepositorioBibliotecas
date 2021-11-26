/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.repositorios;

import co.usa.ciclo3.reto3.modelo.CalificarReserva;
import co.usa.ciclo3.reto3.modelo.Clientes;
import co.usa.ciclo3.reto3.repositorios.Interfaces.CalificarReservaInterface;
import co.usa.ciclo3.reto3.repositorios.Interfaces.ClienteInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author StefanyW
 */
@Repository
public class CalificarReservaRepositorio extends RepositorioGenericoAbstracto<CalificarReserva, Long>{
    
    @Autowired
    private CalificarReservaInterface anInterfaces;

    @Override
    public CrudRepository<CalificarReserva, Long> getDao() {
        return (CrudRepository<CalificarReserva, Long>) anInterfaces;
    }
    
}
