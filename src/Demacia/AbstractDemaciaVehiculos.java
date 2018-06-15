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
public class AbstractDemaciaVehiculos implements AbstractVehiculos {

    @Override
    public Vehiculo geDemaciaVehi(int r) {
             switch(r){
            case 1:
                return new VehiculoBallesta();
            case 2:
                return new VehiculoTanque();
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
