/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author StefanyW
 */

@Data
@Entity
@Table(name = "Client")
public class Clientes implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String correo;
    @Column (length = 45)
    private String contraseña;
    @Column (length = 250)
    private String nombre;
    @Column (length = 45)
    private Integer edad;
    
    @OneToMany(mappedBy = "Client", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"Client"})
    public List<Mensajes> Message;
    
    @OneToMany(mappedBy = "Client", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"Library", "Client"})
    public List<Reservas> Reservations;
        
}
