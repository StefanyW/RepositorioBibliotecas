/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.servicios;

import co.usa.ciclo3.reto3.modelo.Clientes;
import co.usa.ciclo3.reto3.repositorios.ClienteRepositorio;
import co.usa.ciclo3.reto3.repositorios.RepositorioGenericoAbstracto;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author StefanyW
 */

@Service
public class ClienteServicio extends ServicioGenericoAbstracto <Clientes, Long> {

    @Autowired
    private ClienteRepositorio repositorio;
    
    @Override
    public RepositorioGenericoAbstracto<Clientes, Long> getRepository() {
       return repositorio;
    }   
    
    @Override
    public Clientes guardar(Clientes objeto) {
        if (objeto.getIdClient()== null){
            return repositorio.guardar(objeto);
        }else{
            Optional<Clientes> c = obtenerPorId(objeto.getIdClient()) ;
            if (c.isPresent()) {
                return objeto;
            }else{
                return repositorio.guardar(objeto);
            }
        }     
    } 

    @Override
    public Clientes actualizar(Clientes objeto) {
        
        if (objeto.getIdClient()!= null){
            return repositorio.guardar(objeto);
        }else{
            Optional<Clientes> c = obtenerPorId(objeto.getIdClient()) ;
            if (c.isPresent()) {
                return objeto;
            }else{
                return repositorio.guardar(objeto);
            }
        }     
        
    }
}
