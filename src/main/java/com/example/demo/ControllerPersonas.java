package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author ross
 */
@RestController
@RequestMapping("/api")
public class ControllerPersonas {

    @GetMapping(path = "hello")
    public String gethello() {
        return "Hello World";
    }

    @GetMapping(path = "/personas/{id}")
    public ModelPersonas getPersonaById(@PathVariable Long id) {
        ModelPersonas persona1 = new ModelPersonas();
        persona1.setClave("001");
        persona1.setDireccion("Las palmas");
        persona1.setNombre("Abigail");
        persona1.setTelefono("7161488");

        ModelPersonas persona2 = new ModelPersonas();
        persona2.setClave("002");
        persona2.setDireccion("Las palmas");
        persona2.setNombre("Rosario");
        persona2.setTelefono("7161488");
        
        if (id==1)
            return persona1;
        else
            return persona2;
    }

    @GetMapping(path = "/personas")
    public List<ModelPersonas> getTodasPersonas() {
        List<ModelPersonas> lsPersonas = new ArrayList<>();

        ModelPersonas persona1 = new ModelPersonas();
        persona1.setClave("007");
        persona1.setDireccion("Londes");
        persona1.setNombre("James Bond");
        persona1.setTelefono("09238182");

        ModelPersonas persona2 = new ModelPersonas();
        persona2.setClave("911");
        persona2.setDireccion("Av.7");
        persona2.setNombre("Emili");
        persona2.setTelefono("7129301");

        lsPersonas.add(persona1);
        lsPersonas.add(persona2);

        return lsPersonas;
    }

}
