package com.cte.storagehandling;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Service
public class StoragehandlingService {
    
    private final StoragehandlingRepository storagehandlingRepository;



    StoragehandlingService(StoragehandlingRepository storagehandlingRepository) {
        super();
        this.storagehandlingRepository = storagehandlingRepository;
    }
/**/
    List<Storagehandling> getAll(){
        var l = new ArrayList<Storagehandling>();
        for(Storagehandling r : storagehandlingRepository.findAll())
        {
            l.add(r);
        }
        return l;
    }

    Storagehandling get(Integer id){
        return storagehandlingRepository.findById(id).get();
    }

    ResponseEntity<Object> add(Storagehandling p) {
        storagehandlingRepository.save(p);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(p.getId())
        .toUri();
        return ResponseEntity.created(location).build();
    }
      
}
