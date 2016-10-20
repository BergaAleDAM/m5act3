/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercici_3.Utils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNEDAM
 */
public class junit_calcularuf {
    
    public junit_calcularuf() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public final void testprecio0 () throws PrecioException {
        Utils utils = new Utils();
        assertEquals(0,utils.calcularPrecio(0) ,0);
    
    }
    
    @Test
    public final void testpreciomedio () throws PrecioException {
        Utils utils = new Utils();
        assertEquals(300,utils.calcularPrecio(10) ,0);
    
    }
    
    @Test
    public final void testprecioalto () throws PrecioException {
        Utils utils = new Utils();
        assertEquals(380,utils.calcularPrecio(13) ,0);
    
    }
    
}
