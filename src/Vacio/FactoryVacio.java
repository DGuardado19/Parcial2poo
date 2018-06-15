/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacio;

import parcial2poo.AbstratFactory.AbstractRazas;
import parcial2poo.AbstratFactory.RazasInterface;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class FactoryVacio implements AbstractRazas {

    @Override
    public RazasInterface getDemacia(int s) {
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RazasInterface getNoxus(int s) {
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RazasInterface getVacio(int s) {
        switch (s) {
            case 1:
                return new EBaseVacio();
            case 2:
                return new ECuartelVacio();
            case 3:
                return new ErecursoIcathia();
            case 4:
                return new ErecursoOscuridad();
            case 5:
                return new ErecursoPlasma();
            case 6:
                return new Evehiculo1Vacio();
            case 7:
                return new Evehiculo2Vacio();
        }
        return null;
    }
    
}
