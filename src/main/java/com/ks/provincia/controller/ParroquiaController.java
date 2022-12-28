package com.ks.provincia.controller;

import com.ks.provincia.model.Parroquia;
import com.ks.provincia.service.IParroquia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("/parroquia")
public class ParroquiaController {

    @Autowired
    private IParroquia parroquiaService;

    @PostMapping
    public ResponseEntity<?> saveParroquia(@RequestBody Parroquia parroquia){
        return new ResponseEntity<>(parroquiaService.saveParroquia(parroquia),
                HttpStatus.CREATED);
    }

    @DeleteMapping("{parroquiaId}")
    public ResponseEntity<?> deleteParroquia(@PathVariable Long parroquiaId){
        parroquiaService.deleteParroquia(parroquiaId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllParroquias()
    {
        return new ResponseEntity<>(parroquiaService.findAllParroquias(),HttpStatus.OK);
    }

}
