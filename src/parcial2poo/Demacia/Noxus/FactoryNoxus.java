/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2poo.Demacia.Noxus;

import parcial2poo.AbstratFactory.AbstractRazas;
import parcial2poo.AbstratFactory.Demacia;
import parcial2poo.AbstratFactory.Noxus;
import parcial2poo.AbstratFactory.Vacio;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class FactoryNoxus implements AbstractRazas {

    @Override
    public Demacia getDemacia(String s) {
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Noxus getNoxus(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vacio getVacio(String s) {
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
}