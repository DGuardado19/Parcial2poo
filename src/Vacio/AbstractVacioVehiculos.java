/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacio;

import Noxus.Vehiculo2;
import Noxus.VehiculoLanzallamas;
import VehiculosyTropas.AbstractVehiculos;
import VehiculosyTropas.Vehiculo;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class AbstractVacioVehiculos implements AbstractVehiculos {
    @Override
    public Vehiculo geDemaciaVehi(int r) {
        return null;
    }

    @Override
    public Vehiculo getNoxusVehi(int r) {
      return null;
    }

    @Override
    public Vehiculo getVacioVehi(int r) {
               switch(r){
            case 1:
                return new Vehiculo1Vacio();
            case 2:
                return new Vehiculo2Vacio();
        }
        return null;
    }
    
}
