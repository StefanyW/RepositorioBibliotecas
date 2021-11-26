/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.repositorios;

import co.usa.ciclo3.reto3.modelo.Categoria;
import co.usa.ciclo3.reto3.repositorios.Interfaces.CategoriaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author StefanyW
 */
@Repository
public class CategoriaRepositorio extends RepositorioGenericoAbstracto<Categoria, Long>{
    
    @Autowired
    private CategoriaInterface anInterfaces;

    @Override
    public CrudRepository<Categoria, Long> getDao() {
        return (CrudRepository<Categoria, Long>) anInterfaces;
    }

    
}
