/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demacia;

import VehiculosyTropas.AbstractVehiculos;
import VehiculosyTropas.Vehiculo;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class VehiculosDemaciaProducer implements AbstractVehiculos {

    @Override
    public Vehiculo geDemaciaVehi(int r) {
        switch(r){
            case 1:
   //             return new VehiculoBallas1();
            case 2:
     //           return new VehiculoBallas2();
        }
        return null;
    }

    @Override
    public Vehiculo getNoxusVehi(int r) {
        return null;
    }

    @Override
    public Vehiculo getVacioVehi(int r) {
        return null;
    }
    
}
