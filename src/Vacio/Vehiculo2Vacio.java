/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacio;

import VehiculosyTropas.Vehi;
import VehiculosyTropas.Vehiculo;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class Vehiculo2Vacio implements Vehiculo {
    private static Vehi vehi = new Vehi();

    @Override
    public void crearVehiculos() {
        FactoryVacio vacio = new FactoryVacio();
        vacio.getVacio(7).CrearEVehiculo();
        vehi.setNombre("Vehiculo Vacio2");
        vehi.setRaza("Vacio");
        vehi.setVida(600);
        vehi.setFase(3);
        vehi.setPrecio(1, 5000);
        vehi.setPrecio1(3, 2000);
        vehi.setDamage(60);
    }

    @Override
    public Vehi Instancia() {
        return vehi;
    }
    
}
