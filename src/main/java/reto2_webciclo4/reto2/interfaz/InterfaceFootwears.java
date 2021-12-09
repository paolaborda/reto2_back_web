/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reto2_webciclo4.reto2.interfaz;

import org.springframework.data.mongodb.repository.MongoRepository;
import reto2_webciclo4.reto2.modelo.Footwears;


/**
 *
 * @author user
 */
public interface InterfaceFootwears extends MongoRepository<Footwears,String>{
    
}
