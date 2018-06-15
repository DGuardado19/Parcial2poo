/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demacia;

import VehiculosyTropas.AbstractTropas;
import VehiculosyTropas.Tropas;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class AbstractDemaciaTropas implements AbstractTropas {

    @Override
    public Tropas getDemaciaTropas(int s) {
               switch(s){
            case 1:
                return new Tropa1Demacia();
            case 2:
                return new Tropa2Demacia();
        }
        return null;
    }

    @Override
    public Tropas getNoxusTropas(int s) {
        return null;
    }

    @Override
    public Tropas getVacioTropas(int s) {
        return null;
    }
    
}
