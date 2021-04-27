package com.cte.storagehandling;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoragehandlingController {

    @Autowired
    private StoragehandlingService storagehandlingService;

    @GetMapping(path="/")
    @CrossOrigin()
    String empty()
    {
        return "Storagehandling";
    }

    @GetMapping(path="/storagehandling")
    @CrossOrigin()
    List<Storagehandling> getAll(){
        return storagehandlingService.getAll();
    }

    @GetMapping(path="/storagehandling/{id}")
    @CrossOrigin()
    Storagehandling getSingle(@PathVariable Integer id){
        return storagehandlingService.get(id);
    }

    /*Add a new product and store in the database */
    @PostMapping(path="/storagehandling", consumes="application/json", produces="application/json")
    @CrossOrigin()
    ResponseEntity<Object> add(@RequestBody Storagehandling p){
        return storagehandlingService.add(p);
    }

}
