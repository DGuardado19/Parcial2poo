/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosyTropas;

import EdificiosPlan.EVehiculo;
import java.util.ArrayList;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class Vehi implements Planvehiculo {
    public String nombre, raza;
    public int  vida, damage, recurso, recurso1, costo, costo1, fase;
    EVehiculo vehiculo;
    
    public ArrayList<Vehiculo> vehi = new ArrayList<>();
    @Override
    public void setNombre(String nombre) {
        this.nombre= nombre;
    }

    @Override
    public void setRaza(String raza) {
        this.raza=raza;
    }

    @Override
    public void setFase(int fase) {
        this.fase=fase;
    }

    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public void setDamage(int ad) {
        this.damage=ad;
    }

    @Override
    public void setPrecio(int recurso, int costo) {
        this.recurso=recurso;
        this.costo= costo;
    }

    @Override
    public void setPrecio1(int recurso, int costo) {
        this.costo1= costo;
        this.recurso1= recurso;
    }


    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getRaza() {
        return this.raza;
    }

    @Override
    public int getFase() {
        return this.fase;
    }

    @Override
    public int getVida() {
        return this.vida;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public int[] getPrecio() {
         int[] precio = new int[1];
        precio[0] = this.recurso;
        precio[1] = this.costo;
        return precio;
    }

    @Override
    public int[] getPrecio1() {
         int[] precio = new int[1];
        precio[0] = this.recurso1;
        precio[1] = this.costo1;
        return precio;
    }

    @Override
    public EVehiculo getEdificio() {
        return this.vehiculo;
    }

    @Override
    public void setEdificio(EVehiculo Edificio) {
        this.vehiculo= Edificio;
    }

  
    
}
