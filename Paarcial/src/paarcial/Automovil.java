/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paarcial;

/**
 *
 * @author lolsn
 */
public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private TipoCombustible tipoCombustible;

    public Automovil(String marca, String modelo, int año, int numeroPuertas, TipoCombustible tipoCombustible) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String imprimirInformacion() {
        return super.imprimirInformacion() + ", " + numeroPuertas + " puertas, combustión a " + tipoCombustible;
    }
}

