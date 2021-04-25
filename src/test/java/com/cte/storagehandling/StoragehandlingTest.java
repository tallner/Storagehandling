package com.cte.storagehandling;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StoragehandlingTest {
    
    @Test
    void calculateCustomerPrice_checkValueInteger(){
        int addPercentageToPrice = 20;
        Storagehandling storagehandling = new Storagehandling();
        storagehandling.setName("X20CP0292");
        storagehandling.setlink("https://www.br-automation.com/en/products/x20cp0292/");
        storagehandling.setPrice(600);

        assertThat(storagehandling.calculateCustomerPrice((float) addPercentageToPrice)).isEqualTo(720);
    }
    
    @Test
    void calculateCustomerPrice_checkValueFloat(){
        float addPercentageToPrice = 20;
        Storagehandling storagehandling = new Storagehandling();
        storagehandling.setName("X20CP0292");
        storagehandling.setlink("https://www.br-automation.com/en/products/x20cp0292/");
        storagehandling.setPrice(93);

        assertThat(storagehandling.calculateCustomerPrice(addPercentageToPrice)).isEqualTo(111.6f);
    }

    
    
}
