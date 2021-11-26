/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.servicios;

import co.usa.ciclo3.reto3.modelo.CalificarReserva;
import co.usa.ciclo3.reto3.repositorios.CalificarReservaRepositorio;
import co.usa.ciclo3.reto3.repositorios.RepositorioGenericoAbstracto;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author StefanyW
 */

@Service
public class CalificarReservasServicio extends ServicioGenericoAbstracto <CalificarReserva, Long>{
 
    @Autowired
    private CalificarReservaRepositorio repositorio;
    
    @Override
    public RepositorioGenericoAbstracto<CalificarReserva, Long> getRepository() {
        return repositorio;
    }

    @Override
    public CalificarReserva guardar(CalificarReserva objeto) {
        if (objeto.getId() == null){
            return repositorio.guardar(objeto);
        }else{
            Optional<CalificarReserva> c = obtenerPorId(objeto.getId());
            if (c.isPresent()){
                return repositorio.guardar(objeto);
            }else{
                return objeto;           
            }   
        }  
    }

    @Override
    public CalificarReserva actualizar(CalificarReserva objeto) {
        if (objeto.getId() != null){
            return repositorio.guardar(objeto);
        }else{
            Optional<CalificarReserva> c = obtenerPorId(objeto.getId());
            if (c.isPresent()){
                return repositorio.guardar(objeto);
            }else{
                return objeto;
            }
        }
    }
    
}
