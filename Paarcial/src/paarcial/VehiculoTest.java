
package paarcial;


public class VehiculoTest {
    private Vehiculo vehiculo;

 
    public void setUp() {
        vehiculo = new Vehiculo("Toyota", "Corolla", 2020);
    }

    
    public void testVehiculoCreation() {
        assertNotNull(vehiculo, "El objeto Vehiculo no debería ser null");
        assertEquals("Toyota", vehiculo.getMarca());
        assertEquals("Corolla", vehiculo.getModelo());
        assertEquals(2020, vehiculo.getAño());
    }

    
    public void testImprimirInformacion() {
        String expectedOutput = "Toyota Corolla 2020";
        assertEquals(expectedOutput, vehiculo.imprimirInformacion());
    }

    
    public void testGettersAndSetters() {
        vehiculo.setMarca("Honda");
        vehiculo.setModelo("Civic");
        vehiculo.setAño(2019);

        assertEquals("Honda", vehiculo.getMarca());
        assertEquals("Civic", vehiculo.getModelo());
        assertEquals(2019, vehiculo.getAño());
    }

    private void assertNotNull(Vehiculo vehiculo, String el_objeto_Vehiculo_no_debería_ser_null) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void assertEquals(String toyota, String marca) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void assertEquals(int i, int año) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

