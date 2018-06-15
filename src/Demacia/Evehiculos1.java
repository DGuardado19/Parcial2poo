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
public class Evehiculos1 implements RazasInterface {

    private static EVehiculo vehi = new EVehiculo();

    @Override
    public void CrearEBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearECuartel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CrearERecurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CrearEVehiculo() {
        vehi.setNombre("Ballesta");
        vehi.setVida(1000);
        vehi.setRaza("Demacia");
        vehi.setPrecio(1, 5000);
        vehi.setPrecio1(3, 1000);
    }

    @Override
    public ERecurso InstanciaRecurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EBase InstanciaBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ECuartel InstanciaCuartel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EVehiculo InstanciaVehiculo() {
        return vehi;
    }

}
