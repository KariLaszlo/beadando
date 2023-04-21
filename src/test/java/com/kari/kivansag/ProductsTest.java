package com.kari.kivansag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProductsTest {
    
    public ProductsTest() 
    {}
         
    Products instance;
    
    
    @BeforeEach
    public void setUp() 
    {
        instance = new Products("Televizio", 20000);
    }
    
    @Test
    public void testGetterDefault()
    {
        assertEquals("Televizio", instance.getName(),"Get-Name");
        assertEquals(20000, instance.getCost(),"Get-Price");
        assertEquals(0, instance.getStock(),"Get-Stock");
    }
    
}
