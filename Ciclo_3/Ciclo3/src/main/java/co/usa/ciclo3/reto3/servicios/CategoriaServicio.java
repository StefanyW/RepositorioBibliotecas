/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.servicios;

import co.usa.ciclo3.reto3.modelo.Categoria;
import co.usa.ciclo3.reto3.repositorios.CategoriaRepositorio;
import co.usa.ciclo3.reto3.repositorios.RepositorioGenericoAbstracto;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author StefanyW
 */

@Service
public class CategoriaServicio extends ServicioGenericoAbstracto <Categoria, Long>{

    @Autowired
    private CategoriaRepositorio repositorio;
    
    @Override
    public RepositorioGenericoAbstracto<Categoria, Long> getRepository() {
        return null;
    }

    @Override
    public Categoria guardar(Categoria objeto) {
        if (objeto.getId()== null){
            return repositorio.guardar(objeto);
        }else{
            Optional<Categoria> c = obtenerPorId(objeto.getId()) ;
            if (c.isPresent()) {
                return objeto;
            }else{
                return repositorio.guardar(objeto);
            }
        }
    }

    @Override
    public Categoria actualizar(Categoria objeto) {
        if (objeto.getId()!= null){
            return repositorio.guardar(objeto);
        }else{
            Optional<Categoria> c = obtenerPorId(objeto.getId()) ;
            if (c.isPresent()) {
                return objeto;
            }else{
                return repositorio.guardar(objeto);
            }
        } 
    }
    
}
