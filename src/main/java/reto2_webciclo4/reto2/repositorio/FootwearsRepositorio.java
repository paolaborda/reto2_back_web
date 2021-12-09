/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2_webciclo4.reto2.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reto2_webciclo4.reto2.interfaz.InterfaceFootwears;
import reto2_webciclo4.reto2.modelo.Footwears;

/**
 *
 * @author user
 */
@Repository
public class FootwearsRepositorio {
    @Autowired
    
    private InterfaceFootwears repository;
    
    public List<Footwears> getAll(){
        return repository.findAll();
    }
    
    public Optional<Footwears> getFootwear(String reference){
        return repository.findById(reference);
    }
   
    public Footwears create(Footwears Footwears){
        return repository.save(Footwears);
    }
    public void update (Footwears Footwears){
        repository.save(Footwears);
    }
    public void delete (Footwears Footwears){
        repository.delete(Footwears);
    }
}
