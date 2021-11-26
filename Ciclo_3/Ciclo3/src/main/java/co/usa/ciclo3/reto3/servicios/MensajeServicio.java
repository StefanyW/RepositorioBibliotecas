/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.servicios;

import co.usa.ciclo3.reto3.modelo.Mensajes;
import co.usa.ciclo3.reto3.repositorios.MensajeRepositorio;
import co.usa.ciclo3.reto3.repositorios.RepositorioGenericoAbstracto;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author StefanyW
 */

@Service
public class MensajeServicio extends ServicioGenericoAbstracto<Mensajes, Long>{

    @Autowired
    private MensajeRepositorio repositorio;
    
    @Override
    public RepositorioGenericoAbstracto<Mensajes, Long> getRepository() {
        return repositorio;
    }

    @Override
    public Mensajes guardar(Mensajes objeto) {
        if (objeto.getIdMessage()== null){
            return repositorio.guardar(objeto);
        }else{
            Optional<Mensajes> c = obtenerPorId(objeto.getIdMessage()) ;
            if (c.isPresent()) {
                return objeto;
            }else{
                return repositorio.guardar(objeto);
            }
        }
    }

    @Override
    public Mensajes actualizar(Mensajes objeto) {
        if (objeto.getIdMessage()!= null){
            return repositorio.guardar(objeto);
        }else{
            Optional<Mensajes> c = obtenerPorId(objeto.getIdMessage()) ;
            if (c.isPresent()) {
                return objeto;
            }else{
                return repositorio.guardar(objeto);
            }
        }
    }
    
    
    
}
