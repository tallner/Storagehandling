package com.cte.storagehandling;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StoragehandlingServiceTest {
    StoragehandlingRepository storagehandlingRepository;
    ArrayList<Storagehandling> testlist;
    @BeforeEach
    void init()
    {
        testlist = new ArrayList<Storagehandling>();
        testlist.add(new Storagehandling());
        testlist.add(new Storagehandling());
        testlist.add(new Storagehandling());
        storagehandlingRepository = Mockito.mock(StoragehandlingRepository.class);
        when(storagehandlingRepository.findAll()).thenReturn(testlist);
    
    }

    @Test
    void getAllShouldReturnAllRecords()
    {
        var sut = new StoragehandlingService(storagehandlingRepository);
        assertArrayEquals( testlist.toArray() ,sut.getAll().toArray());            
    }

/** /
    @Test
    void getOneShouldReturnOneRecord()
    {
        var sut = new StoragehandlingService(storagehandlingRepository);
      //  assertArrayEquals( testlist.toArray() ,sut.get(0));
        assertEquals(testlist.get(0), sut.get(0));    
    }
/**/    
}
