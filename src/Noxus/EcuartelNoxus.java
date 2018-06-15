/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Noxus;

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
public class EcuartelNoxus implements RazasInterface {

    private static ECuartel cuartel = new ECuartel();

    @Override
    public void CrearEBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearECuartel() {
        cuartel.setNombre("Cuartel Noxiano");
        cuartel.setRaza("Noxus");
        cuartel.setFase(2);
        cuartel.setVida(1000);
        cuartel.setPrecioRecurso1(1, 5000);
        cuartel.setPrecioRecurso2(3, 2000);
    }

    @Override
    public void CrearERecurso() {

    }

    @Override
    public void CrearEVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return cuartel;
    }

    @Override
    public EVehiculo InstanciaVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
