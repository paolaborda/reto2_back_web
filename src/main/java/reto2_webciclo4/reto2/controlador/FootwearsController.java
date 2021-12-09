/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2_webciclo4.reto2.controlador;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reto2_webciclo4.reto2.modelo.Footwears;
import reto2_webciclo4.reto2.servicio.FootwearsService;



        
/**
 *
 * @author user
 */
@RestController
@RequestMapping("/api/accessory")
@CrossOrigin("*")
public class FootwearsController {
    
    @Autowired
  private FootwearsService footwearService;
    
    @GetMapping ("/all")
    public List<Footwears> getAll(){
        return footwearService.getAll();
    }
    @GetMapping("/{reference}")
    public Optional<Footwears> getFootwear(@PathVariable("reference")String reference){
        return footwearService.getFootwear(reference);
    }
    @PostMapping("New")
    @ResponseStatus(HttpStatus.CREATED)
    public Footwears create (@RequestBody Footwears gadget){
        return footwearService.create(gadget);     
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Footwears update (@RequestBody Footwears gadget){
        return footwearService.update(gadget);
        }
    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference){
      return footwearService.delete(reference);  
    }
}
