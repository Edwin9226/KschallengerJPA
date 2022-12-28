package com.ks.provincia.controller;

import com.ks.provincia.model.Canton;
import com.ks.provincia.model.Provincia;
import com.ks.provincia.service.ICanton;
import com.ks.provincia.service.IProvincia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/canton")
public class CantonController {

    @Autowired
    private ICanton cantonService;

    @PostMapping
    public ResponseEntity<?> saveProvincia(@RequestBody Canton canton){
        return new ResponseEntity<>(cantonService.saveCanton(canton),
                HttpStatus.CREATED);
    }

    @DeleteMapping("{cantonId}")
    public ResponseEntity<?> deleteProvincia(@PathVariable Long cantonId){
        cantonService.deleteCanton(cantonId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllCantones()
    {
        return new ResponseEntity<>(cantonService.findAllCantones(),HttpStatus.OK);
    }

}
