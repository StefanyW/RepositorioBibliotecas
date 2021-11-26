/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.servicios;

import co.usa.ciclo3.reto3.modelo.UsuariosAdministradores;
import co.usa.ciclo3.reto3.repositorios.AdministradoresRepositorio;
import co.usa.ciclo3.reto3.repositorios.RepositorioGenericoAbstracto;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author StefanyW
 */

@Service
public class UsuariosAdministradoresServicio extends ServicioGenericoAbstracto<UsuariosAdministradores, Long>{

    @Autowired
    private AdministradoresRepositorio repositorio;
    
    @Override
    public RepositorioGenericoAbstracto getRepository() {
        return repositorio;
        
    }
    

    @Override
    public UsuariosAdministradores guardar(UsuariosAdministradores objeto) {
        if (objeto.getId() == null){
            return repositorio.guardar(objeto);
        }else{
            Optional<UsuariosAdministradores> c = obtenerPorId(objeto.getId());
            if (c.isPresent()){
                return repositorio.guardar(objeto);
            }else{
                return objeto;           
            }   
        }
       }

    @Override
    public UsuariosAdministradores actualizar(UsuariosAdministradores objeto) {
         if (objeto.getId() != null){
            return repositorio.guardar(objeto);
        }else{
            Optional<UsuariosAdministradores> c = obtenerPorId(objeto.getId());
            if (c.isPresent()){
                return repositorio.guardar(objeto);
            }else{
                return objeto;
            }
        }
    }
}
