/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2poo.AbstratFactory;

import EdificiosPlan.EBase;
import EdificiosPlan.ECuartel;
import EdificiosPlan.ERecurso;
import EdificiosPlan.EVehiculo;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public interface RazasInterface {

    public void CrearEBase();

    public void crearECuartel();

    public void CrearERecurso();

    public void CrearEVehiculo();

    public ERecurso InstanciaRecurso();

    public EBase InstanciaBase();

    public ECuartel InstanciaCuartel();

    public EVehiculo InstanciaVehiculo();

}
