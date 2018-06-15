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
public class ErecursoPlata implements RazasInterface {
private static ERecurso recurso= new ERecurso();

    @Override
    public void CrearEBase() {
        
    }

    @Override
    public void crearECuartel() {
        
    }

    @Override
    public void CrearERecurso() {
        recurso.setNombre("Recolector de Plata");
        recurso.setVida(800);
        recurso.setCantidad(2000);
        recurso.setMax(1000);
        recurso.setFase(2);
        recurso.setPrecio(1, 5000);
        recurso.setPrecio1(2, 2000);
    }

    @Override
    public void CrearEVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ERecurso InstanciaRecurso() {
        return recurso;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}