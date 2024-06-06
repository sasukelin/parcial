
package paarcial;




public class MotocicletaTest {
    private Motocicleta motocicleta;

    
    public void setUp() {
        motocicleta = new Motocicleta("Yamaha", "YZF-R3", 2020, "Deportiva");
    }


    public void testMotocicletaCreation() {
        assertNotNull(motocicleta, "El objeto Motocicleta no debería ser null");
        assertEquals("Yamaha", motocicleta.getMarca());
        assertEquals("YZF-R3", motocicleta.getModelo());
        assertEquals(2020, motocicleta.getAño());
        assertEquals("Deportiva", motocicleta.getTipoMotocicleta());
    }

    
    public void testImprimirInformacion() {
        String expectedOutput = "Yamaha YZF-R3 2020, tipo de motocicleta: Deportiva";
        assertEquals(expectedOutput, motocicleta.imprimirInformacion());
    }

    
    public void testGettersAndSetters() {
        motocicleta.setMarca("Honda");
        motocicleta.setModelo("CBR500R");
        motocicleta.setAño(2021);
        motocicleta.setTipoMotocicleta("Touring");

        assertEquals("Honda", motocicleta.getMarca());
        assertEquals("CBR500R", motocicleta.getModelo());
        assertEquals(2021, motocicleta.getAño());
        assertEquals("Touring", motocicleta.getTipoMotocicleta());
    }

    private void assertNotNull(Motocicleta motocicleta, String el_objeto_Motocicleta_no_debería_ser_null) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void assertEquals(String yamaha, String marca) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void assertEquals(int i, int año) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

