package com.ks.provincia.controller;

import com.ks.provincia.model.Provincia;
import com.ks.provincia.service.IProvincia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("/provincia")
public class ProvinciaController {

    @Autowired
    private IProvincia provinciaService;

    @PostMapping
    public ResponseEntity<?> saveProvincia(@RequestBody Provincia provincia){
        return new ResponseEntity<>(provinciaService.saveProvincia(provincia),
                HttpStatus.CREATED);
    }

    @DeleteMapping("{provinciaId}")
    public ResponseEntity<?> deleteProvincia(@PathVariable Long provinciaId){
        provinciaService.deleteProvincia(provinciaId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllProvincias()
    {
        return new ResponseEntity<>(provinciaService.findAllProvincias(),HttpStatus.OK);
    }

    //@RequestMapping(value="/listarprovincia",produces = "application/json",method = {RequestMethod.GET} )
    @RequestMapping(value="/listarprovincia", produces = "application/json", method = RequestMethod.GET)
    public String getProvincias(Model model){
        System.out.println(provinciaService.findAllProvincias());
        model.addAttribute("provincias", provinciaService.findAllProvincias());
        return"/listarprovincia";
    }

}
