/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.servicios;

import co.usa.ciclo3.reto3.modelo.Bibliotecas;
import co.usa.ciclo3.reto3.repositorios.BibliotecaRepositorio;
import co.usa.ciclo3.reto3.repositorios.RepositorioGenericoAbstracto;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author StefanyW
 */

@Service
public class BibliotecaServicio extends ServicioGenericoAbstracto <Bibliotecas, Integer>{

    
    @Autowired
    private BibliotecaRepositorio repositorio;
        
    
    @Override
    public RepositorioGenericoAbstracto<Bibliotecas, Integer> getRepository(){
        return repositorio;
    }

    @Override
    public Bibliotecas guardar(Bibliotecas objeto) {
        if (objeto.getId() == null){
            return repositorio.guardar(objeto);
        }else{
            Optional<Bibliotecas> c = obtenerPorId(objeto.getId());
            if (c.isPresent()){
                return repositorio.guardar(objeto);
            }else{
                return objeto;           
            }   
        }  
    }
    
     @Override
    public Bibliotecas actualizar(Bibliotecas objeto) {
        if (objeto.getId() != null){
            return repositorio.guardar(objeto);
        }else{
            Optional<Bibliotecas> c = obtenerPorId(objeto.getId());
            if (c.isPresent()){
                return repositorio.guardar(objeto);
            }else{
                return objeto;
            }
        }
    }
    
}
