/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paarcial;

/**
 *
 * @author lolsn
 */
public class Motocicleta extends Vehiculo {
    private String tipoMotocicleta;

    public Motocicleta(String marca, String modelo, int año, String tipoMotocicleta) {
        super(marca, modelo, año);
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public String getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(String tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    @Override
    public String imprimirInformacion() {
        return super.imprimirInformacion() + ", tipo de motocicleta: " + tipoMotocicleta;
    }
}

