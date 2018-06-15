/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosyTropas;

import EdificiosPlan.EVehiculo;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public interface Planvehiculo {

    public void setNombre(String nombre);

    public void setRaza(String raza);

    public void setFase(int fase);

    public void setVida(int vida);

    public void setDamage(int ad);

    public void setPrecio(int recurso, int costo);

    public void setPrecio1(int recurso, int costo);

    public String getNombre();

    public String getRaza();

    public int getFase();

    public int getVida();

    public int getDamage();

    public int[] getPrecio();

    public int[] getPrecio1();

    public EVehiculo getEdificio();

    public void setEdificio(EVehiculo Edificio);

}
