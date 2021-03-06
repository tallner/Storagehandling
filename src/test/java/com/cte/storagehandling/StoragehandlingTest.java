package com.cte.storagehandling;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StoragehandlingTest {
    
    @Test
    void calculateCustomerPrice_checkValueInteger(){
     //   int addPercentageToPrice = 20;
        Storagehandling storagehandling = new Storagehandling();
        storagehandling.setName("X20CP0292");
        storagehandling.setLocation("Stockholm, Johans skrivbord");
        storagehandling.setSerialnumber("2345A98JUT56");
        storagehandling.setStatus("Internal tests until 2025.04.19");

        assertThat(storagehandling.getStatus().compareTo("Internal tests until 2025.04.19"));
        
        
    }
/** /
    @Test
    void calculateCustomerPrice_checkValueFloat(){
        //float addPercentageToPrice = 20;
        Storagehandling storagehandling = new Storagehandling();
        storagehandling.setName("X20CP0292");
     //   storagehandling.setlink("https://www.br-automation.com/en/products/x20cp0292/");
      //  storagehandling.setPrice(93);

       // assertThat(storagehandling.calculateCustomerPrice(addPercentageToPrice)).isEqualTo(111.6f);
    }
/**/
    
    
}
