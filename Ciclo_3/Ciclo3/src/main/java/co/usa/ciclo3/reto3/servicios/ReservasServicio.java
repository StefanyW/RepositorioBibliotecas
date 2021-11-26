/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.servicios;

import co.usa.ciclo3.reto3.modelo.Reservas;
import co.usa.ciclo3.reto3.repositorios.RepositorioGenericoAbstracto;
import co.usa.ciclo3.reto3.repositorios.ReservaRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author StefanyW
 */
@Service
public class ReservasServicio extends ServicioGenericoAbstracto <Reservas, Long>{
    
    @Autowired
    private ReservaRepositorio repositorio;
    
    @Override
    public RepositorioGenericoAbstracto<Reservas, Long> getRepository() {
       return repositorio;
    }   
    
    @Override
    public Reservas guardar(Reservas objeto) {
        if (objeto.getIdReservation()== null){
            return repositorio.guardar(objeto);
        }else{
            Optional<Reservas> c = obtenerPorId(objeto.getIdReservation()) ;
            if (c.isPresent()) {
                return objeto;
            }else{
                return repositorio.guardar(objeto);
            }
        }     
    } 

    @Override
    public Reservas actualizar(Reservas objeto) {
        if (objeto.getIdReservation()!= null){
            return repositorio.guardar(objeto);
        }else{
            Optional<Reservas> c = obtenerPorId(objeto.getIdReservation()) ;
            if (c.isPresent()) {
                return objeto;
            }else{
                return repositorio.guardar(objeto);
            }
        }     
        
    }
      
}
    

