/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demacia;

import VehiculosyTropas.Vehi;
import VehiculosyTropas.Vehiculo;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class VehiculoBallesta implements Vehiculo {

    private static Vehi vehi = new Vehi();

    @Override
    public void crearVehiculos() {
        FactoryDemacia demacia = new FactoryDemacia();
        demacia.getDemacia(6).CrearEVehiculo();
        vehi.setNombre("Vehiculo Ballesta");
        vehi.setRaza("Demacia");
        vehi.setVida(600);
        vehi.setFase(3);
        vehi.setPrecio(1, 5000);
        vehi.setPrecio1(3, 2000);
        vehi.setDamage(100);

    }

    @Override
    public Vehi Instancia() {
        return vehi;
    }

}
