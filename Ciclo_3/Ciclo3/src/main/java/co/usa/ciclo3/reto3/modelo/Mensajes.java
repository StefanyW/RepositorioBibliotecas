/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.modelo;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author StefanyW
 */

@Data
@Entity
@Table(name = "Message")
public class Mensajes implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMessage;
    @Column (length = 250)
    private String messageText;
    
    @ManyToOne
    @JoinColumn(name = "Id")
    @JsonIncludeProperties({"Message","Client","Reservation"})
    private Bibliotecas biblioteca;
    
    @ManyToOne
    @JoinColumn(name = "ClientId")
    @JsonIncludeProperties({"Message","Reservation","Client"})
    private Clientes client;
    
}
