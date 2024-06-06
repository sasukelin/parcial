
package paarcial;


import paarcial.Vehiculo.TipoCombustible;


public class PruebaAutomovil {
    private Automovil automovil;


    public void setUp() {
        automovil = new Automovil("Honda", "Civic", 2019, 4, TipoCombustible.GASOLINA);
    }

 
    public void testAutomovilCreation() {
        assertNotNull(automovil, "El objeto Automovil no debería ser null");
        assertEquals("Honda", automovil.getMarca());
        assertEquals("Civic", automovil.getModelo());
        assertEquals(2019, automovil.getAño());
        assertEquals(4, automovil.getNumeroPuertas());
        assertEquals(TipoCombustible.GASOLINA, automovil.getTipoCombustible());
    }

  
    public void testImprimirInformacion() {
        String expectedOutput = "Honda Civic 2019, 4 puertas, combustión a GASOLINA";
        assertEquals(expectedOutput, automovil.imprimirInformacion());
    }


    public void testGettersAndSetters() {
        automovil.setMarca("Toyota");
        automovil.setModelo("Corolla");
        automovil.setAño(2020);
        automovil.setNumeroPuertas(5);
        automovil.setTipoCombustible(TipoCombustible.HIBRIDO);

        assertEquals("Toyota", automovil.getMarca());
        assertEquals("Corolla", automovil.getModelo());
        assertEquals(2020, automovil.getAño());
        assertEquals(5, automovil.getNumeroPuertas());
        assertEquals(TipoCombustible.HIBRIDO, automovil.getTipoCombustible());
    }

    
    public void testSetNumeroPuertas() {
        automovil.setNumeroPuertas(2);
        assertEquals(2, automovil.getNumeroPuertas());
    }

   
    public void testSetTipoCombustible() {
        automovil.setTipoCombustible(TipoCombustible.ELECTRICO);
        assertEquals(TipoCombustible.ELECTRICO, automovil.getTipoCombustible());
    }

    private void assertNotNull(Automovil automovil, String el_objeto_Automovil_no_debería_ser_null) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(String honda, String marca) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void assertEquals(int i, int año) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void assertEquals(TipoCombustible tipoCombustible, TipoCombustible tipoCombustible0) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
