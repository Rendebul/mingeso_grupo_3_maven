/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import java.util.List;
import model.Producto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rendebul
 */
public class ProductoControllerTest {
    
    public ProductoControllerTest() {
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

    /**
     * Test of getSelected method, of class ProductoController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        ProductoController instance = new ProductoController();
        Producto expResult = instance.getSelected();
        Producto result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class ProductoController.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        Producto selected = new Producto();
        selected.setCiudad("Test");
        selected.setId(Long.MIN_VALUE);
        selected.setCodigoProducto("Test");
        selected.setDescripcion("Descripcion test");
        selected.setPrecio(10000);
        ProductoController instance = new ProductoController();
        instance.setSelected(selected);
        
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getSelected(), selected);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCreate method, of class ProductoController.
     */
    @Test
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        ProductoController instance = new ProductoController();
        Producto result = instance.prepareCreate();
        Producto expResult = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ProductoController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ProductoController instance = new ProductoController();
        instance.create();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ProductoController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ProductoController instance = new ProductoController();
        Producto inicial = new Producto();
        //inicial = instance.getProducto(Long.valueOf(1));
        //instance.setSelected(inicial);
        //instance.getSelected().setCiudad("TestEditar");
        //instance.update();
        //assertEquals(instance.getSelected(), instance.getProducto(instance.getSelected().getId()));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class ProductoController.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        ProductoController instance = new ProductoController();
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class ProductoController.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        ProductoController instance = new ProductoController();
        List<Producto> expResult = null;
        //List<Producto> result = instance.getItems();
        assertEquals(expResult, null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProducto method, of class ProductoController.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto2");
        long id = 1;
        ProductoController instance = new ProductoController();
        Producto expResult = instance.getProducto(id);
        Producto result = instance.getProducto(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
