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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author StefanyW
 */


@Entity
@Data
@Table(name="Library")
public class Bibliotecas implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (length = 45)
    private String nombre;
    @Column (length = 45)
    private String objetivo;
    private Integer capacidad;
    @Column (length = 250)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "CategoryId")
    @JsonIgnoreProperties("Library")
    private Categoria categoria;
    
    @OneToMany(mappedBy = "Library", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"Library", "Client"})
    private List<Mensajes> mensaje;
    
    @OneToMany (mappedBy = "Library", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"Library", "Client"})
    private List<Reservas> Reserva;
   
}
