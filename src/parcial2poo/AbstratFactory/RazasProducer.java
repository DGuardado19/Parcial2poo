/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2poo.AbstratFactory;

import parcial2poo.Demacia.FactoryDemacia;
import parcial2poo.Demacia.Vacio.FactoryVacio;
import parcial2poo.Demacia.Noxus.FactoryNoxus;
/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class RazasProducer {
    public static AbstractRazas getFactory(int s){
        switch (s){
            case 1:
                return new FactoryDemacia();
            case 2:
                return new FactoryNoxus();
            case 3:
                return new FactoryVacio();
                
        }
        return null;
    }
    
}
