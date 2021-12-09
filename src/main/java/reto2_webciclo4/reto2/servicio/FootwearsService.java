/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2_webciclo4.reto2.servicio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reto2_webciclo4.reto2.modelo.Footwears;
import reto2_webciclo4.reto2.repositorio.FootwearsRepositorio;



/**
 *
 * @author user
 */
@Service
public class FootwearsService {
    @Autowired
    private FootwearsRepositorio FootwearRepository;
    
    public List<Footwears> getAll(){
        return FootwearRepository.getAll();
    }
    
    public Optional<Footwears> getFootwear(String reference){
        return FootwearRepository.getFootwear(reference);
    }
            
    public Footwears create (Footwears Footwear){
        if (Footwear.getReference()== null ){
            return Footwear;
        }else {
            return FootwearRepository.create(Footwear);
        }
    }
    
    public Footwears update (Footwears Footwear){
        
        if (Footwear.getReference()!=null){
            Optional<Footwears> FootwearDb = FootwearRepository.getFootwear(Footwear.getReference());
                if (!FootwearDb.isEmpty()){
                
                if (Footwear.getBrand()!=null){
                    FootwearDb.get().setBrand(Footwear.getBrand());
                }
                if (Footwear.getCategory() !=null){
                    FootwearDb.get().setCategory(Footwear.getCategory());
                }   
                if (Footwear.getMaterial() != null) {
                    FootwearDb.get().setMaterial(Footwear.getMaterial());
                }

                if (Footwear.getGender() != null) {
                    FootwearDb.get().setGender(Footwear.getGender());
                }

                if (Footwear.getSize() != null) {
                    FootwearDb.get().setSize(Footwear.getSize());
                }
                
                if (Footwear.getDescription()!=null){
                    FootwearDb.get().setDescription(Footwear.getDescription());
                }
                if (Footwear.getPrice()!=0.0){
                    FootwearDb.get().setPrice(Footwear.getPrice());
                }
                if (Footwear.getQuantity() !=0){
                    FootwearDb.get().setQuantity(Footwear.getQuantity());              
                }
                if (Footwear.getPhotography() !=null){
                    FootwearDb.get().setPhotography(Footwear.getPhotography());
                }
                FootwearDb.get().setAvailability(Footwear.isAvailability());
                FootwearRepository.update(FootwearDb.get());
                return FootwearDb.get(); 
            } else {
               return Footwear;
            }
        } else {
           return Footwear;
         }
      
    }

        public boolean delete(String reference) {
        Boolean aBoolean = getFootwear(reference).map(Footwear -> {
            FootwearRepository.delete(Footwear);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
