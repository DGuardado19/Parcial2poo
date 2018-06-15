/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacio;

import Noxus.FactoryNoxus;
import VehiculosyTropas.Vehi;
import VehiculosyTropas.Vehiculo;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class Vehiculo1Vacio implements Vehiculo {
private static Vehi vehi = new Vehi();
    @Override
    public void crearVehiculos() {
        FactoryVacio vacio = new FactoryVacio();
        vacio.getVacio(6).CrearEVehiculo();
        vehi.setNombre("Vehiculo Vacio");
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
