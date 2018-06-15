/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demacia;

import EdificiosPlan.EBase;
import EdificiosPlan.ECuartel;
import EdificiosPlan.ERecurso;
import EdificiosPlan.EVehiculo;
import parcial2poo.AbstratFactory.AbstractRazas;
import parcial2poo.AbstratFactory.RazasInterface;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class EcuartelDemacia implements RazasInterface{
private static ECuartel cuartel = new ECuartel();
    
    @Override
    public void CrearEBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearECuartel() {
        cuartel.setNombre("Cuartel Demaciano");
        cuartel.setRaza("Demacia");
        cuartel.setFase(2);
        cuartel.setVida(1000);
        cuartel.setPrecioRecurso1(1, 5000);
        cuartel.setPrecioRecurso2(2, 2000);
    }

    @Override
    public void CrearERecurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CrearEVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ERecurso InstanciaRecurso() {
        return null;
    }

    @Override
    public EBase InstanciaBase() {
        return null;
    }

    @Override
    public ECuartel InstanciaCuartel() {
        return cuartel;
    }

    @Override
    public EVehiculo InstanciaVehiculo() {
        return null;
    }
    
}
