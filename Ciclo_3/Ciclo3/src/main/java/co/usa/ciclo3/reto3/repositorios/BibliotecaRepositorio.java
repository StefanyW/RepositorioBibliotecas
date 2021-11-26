/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.repositorios;

import co.usa.ciclo3.reto3.modelo.Bibliotecas;
import co.usa.ciclo3.reto3.repositorios.Interfaces.BibliotecasInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author StefanyW
 */

@Repository
public class BibliotecaRepositorio extends RepositorioGenericoAbstracto<Bibliotecas, Integer>{
    
    @Autowired
    private BibliotecasInterfaces anInterfaces;

    @Override
    public CrudRepository<Bibliotecas, Integer> getDao() {
        return anInterfaces;
    }
    
}
