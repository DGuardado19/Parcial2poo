/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacio;

import VehiculosyTropas.Tropa;
import VehiculosyTropas.Tropas;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class Tropa2Vacio implements Tropas{
       private static Tropa Tropa = new Tropa();

    @Override
    public void crearTropas() {
        Tropa.setNombre("Tropa 2 Vacio");
        Tropa.setRaza("Vacio");
        Tropa.setVida(600);
        Tropa.setFase(3);
        Tropa.setPrecio(1, 5000);
        Tropa.setPrecio1(3, 2000);
        Tropa.setAtaque(100);
    }

    @Override
    public Tropa getInstance() {
        return Tropa;
    }
}
