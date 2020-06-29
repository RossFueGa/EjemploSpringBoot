package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ross
 */
@RestController
@RequestMapping("/api")
public class ControllerPersonas { 
    
    @Autowired
    private RepositoryPersonas repoPersonas;
    

    /*@GetMapping(path = "hello")
    public String gethello() {
        return "Hello World";
    }*/

    @GetMapping(path = "/personas/{id}")
    public ModelPersonas getPersonaById(@PathVariable String id) {
        Optional<ModelPersonas> per = repoPersonas.findById(id);
        return per.get();
    }

    @GetMapping(path = "/personas")
    public List<ModelPersonas> getTodasPersonas() {
        List<ModelPersonas> lsPersonas = new ArrayList<>();
        return lsPersonas;
    }
    
    @PostMapping(path = "/personas")
    public void insertPersona(@RequestBody ModelPersonas persona){
        repoPersonas.save(persona);
    }
    
    @PutMapping(path = "/personas")
    public void updatePersona(@RequestBody ModelPersonas persona){
        repoPersonas.save(persona);
    }
    @DeleteMapping(value = "/personas{id}")
    public void deletePersona(@PathVariable("id") String id){
        repoPersonas.deleteById(id);
    }

}
