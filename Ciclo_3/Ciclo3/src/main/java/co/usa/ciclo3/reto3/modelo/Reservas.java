/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author StefanyW
 */

@Data
@Entity
@Table(name = "Reservation")
public class Reservas implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReservation;
    @ManyToOne
    @JoinColumn(name = "LibraryId")
    private Bibliotecas biblioteca;
    @ManyToOne
    @JoinColumn(name = "ClientId")
    private Clientes cliente;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    
   @OneToMany(mappedBy = "Reservation", cascade = CascadeType.PERSIST)
   @JsonIgnoreProperties({"Reservation"})
   private List<CalificarReserva> score;  
}
