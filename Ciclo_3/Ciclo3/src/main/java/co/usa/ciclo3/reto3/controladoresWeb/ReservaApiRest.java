/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.controladoresWeb;

import co.usa.ciclo3.reto3.modelo.Clientes;
import co.usa.ciclo3.reto3.modelo.Reservas;
import co.usa.ciclo3.reto3.servicios.ClienteServicio;
import co.usa.ciclo3.reto3.servicios.ReservasServicio;
import co.usa.ciclo3.reto3.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author StefanyW
 */
@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin("*")

public class ReservaApiRest extends ControladorGenericoAbstracto<Reservas, Long>{
    
    @Autowired
    private ReservasServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Reservas, Long> getService() {
        return servicio;
        }
    
}
