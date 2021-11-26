/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.reto3.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author StefanyW
 */
@Data
@Entity
@Table(name = "Admin")
public class UsuariosAdministradores implements Serializable{
    
    @Id
    private Long id;
    @Column (length = 250)
    private String nombre;
    @Column (length = 45)
    private String correo;
    @Column (length = 45)
    private String contraseña;

    

      
}
