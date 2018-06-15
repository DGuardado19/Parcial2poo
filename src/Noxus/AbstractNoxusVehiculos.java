/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Noxus;

import VehiculosyTropas.AbstractVehiculos;
import VehiculosyTropas.Vehiculo;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class AbstractNoxusVehiculos implements AbstractVehiculos {

    @Override
    public Vehiculo geDemaciaVehi(int r) {
        return null;
    }

    @Override
    public Vehiculo getNoxusVehi(int r) {
               switch(r){
            case 1:
                return new VehiculoLanzallamas();
            case 2:
                return new Vehiculo2();
        }
        return null;
    }

    @Override
    public Vehiculo getVacioVehi(int r) {
        return null;
    }
    
}
