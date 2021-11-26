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
import org.apache.tomcat.jni.Library;

/**
 *
 * @author StefanyW
 */

@Data
@Entity
@Table (name = "Category")
public class Categoria implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (length = 45)
    private String nombre;
    @Column (length = 250)
    private String descripcion;
    
    @OneToMany(mappedBy = "Category", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties("Category")
    private List<Bibliotecas> librarys;
    
}
