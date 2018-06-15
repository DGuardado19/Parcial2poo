/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Noxus;

import VehiculosyTropas.AbstractTropas;
import VehiculosyTropas.Tropas;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class AbstractNoxusTropas implements AbstractTropas {

    @Override
    public Tropas getDemaciaTropas(int s) {
        return null;
    }

    @Override
    public Tropas getNoxusTropas(int s) {
             switch(s){
            case 1:
                return new Tropa1Noxus();
            case 2:
                return new Tropa2Noxus();
        }
        return null;
    }

    @Override
    public Tropas getVacioTropas(int s) {
        return null;
    }
    
}
