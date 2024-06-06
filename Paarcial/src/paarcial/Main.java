/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paarcial;

import paarcial.Vehiculo.TipoCombustible;

/**
 *
 * @author lolsn
 */
public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2020);
        Automovil automovil = new Automovil("Honda", "Civic", 2019, 4, TipoCombustible.GASOLINA);
        Motocicleta motocicleta = new Motocicleta("Yamaha", "YZF-R3", 2020, "Deportiva");

        System.out.println(vehiculo.imprimirInformacion());
        System.out.println(automovil.imprimirInformacion());
        System.out.println(motocicleta.imprimirInformacion());
    }
}

