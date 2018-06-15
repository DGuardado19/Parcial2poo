/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Noxus;

import parcial2poo.AbstratFactory.AbstractRazas;
import parcial2poo.AbstratFactory.RazasInterface;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class FactoryNoxus implements AbstractRazas {

    @Override
    public RazasInterface getDemacia(int s) {
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RazasInterface getNoxus(int s) {
           switch (s) {
            case 1:
                return new EBaseNoxus();
            case 2:
                return new EcuartelNoxus();
            case 3:
                return new ERecursoSangre();
            case 4:
                return new ErecursoAlmas();
            case 5:
                return new ErecursoPetroleo();
            case 6:
                return new Evehiculo1Noxus();
            case 7:
                return new Evehiculo2Noxus();
        }
        return null;
    }

    @Override
    public RazasInterface getVacio(int s) {
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
}
