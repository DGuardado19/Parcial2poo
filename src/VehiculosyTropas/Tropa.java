/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosyTropas;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class Tropa implements PlanTropas{
    public int fase, vida, ataque, recurso1, recurso, precio1, precio, entrenamiento;
    public String nombre, raza;
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
        this.vida= vida;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public void setPrecio(int recurso, int precio) {
        this.recurso= recurso;
        this.precio= precio;
        
    }

    @Override
    public void setPrecio1(int recurso, int precio) {
        this.precio1= precio;
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
    public int getAtaque() {
        return this.ataque;
    }

    @Override
    public int[] getPrecio() {
        int[] costo = new int[1];
        costo[0] = this.recurso;
        costo[1] = this.precio;
        return costo;
    }

    @Override
    public int[] getPrecio1() {
        int[] costo = new int[1];
        costo[0] = this.recurso1;
        costo[1] = this.precio1;
        return costo;
    }
    
}
