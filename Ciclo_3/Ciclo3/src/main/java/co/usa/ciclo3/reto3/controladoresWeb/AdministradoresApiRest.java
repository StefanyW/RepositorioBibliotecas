/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.controladoresWeb;

import co.usa.ciclo3.reto3.modelo.UsuariosAdministradores;
import co.usa.ciclo3.reto3.servicios.ServicioGenericoAbstracto;
import co.usa.ciclo3.reto3.servicios.UsuariosAdministradoresServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author StefanyW
 */
@RestController
@RequestMapping("/api/Admin")
@CrossOrigin("*")

public class AdministradoresApiRest extends ControladorGenericoAbstracto<UsuariosAdministradores, Long>{
    
    @Autowired
    private UsuariosAdministradoresServicio servicio;

    @Override
    public ServicioGenericoAbstracto<UsuariosAdministradores, Long> getService() {
        return servicio;
        }
    
}
