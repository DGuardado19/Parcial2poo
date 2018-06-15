/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demacia;

import parcial2poo.AbstratFactory.AbstractRazas;
import parcial2poo.AbstratFactory.RazasInterface;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class FactoryDemacia implements AbstractRazas{

    @Override
    public RazasInterface getDemacia(int s) {
           switch (s) {
            case 1:
                return new EBaseDemacia();
            case 2:
                return new EcuartelDemacia();
            case 3:
                return new ErecursoOro();
            case 4:
                return new ErecursoPlata();
            case 5:
                return new ErecursosLuz();
            case 6:
                return new Evehiculos1();
            case 7:
                return new Evehiculos2();
        }
        return null;
    }

    @Override
    public RazasInterface getNoxus(int s) {
        return null;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RazasInterface getVacio(int s) {
        return null;//To change body of generated methods, choose Tools | Templates.
    }
    
}
