/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificiosPlan;

import java.util.ArrayList;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class ECuartel implements PlanCuartel {

    public ArrayList<ECuartel> Ecuartel = new ArrayList<>();
    public String nombre, raza;
    public int precio, precio1, recurso, recurso1, vida, fase;

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public void setRaza(String raza) {
        this.raza=raza;
    }

    @Override
    public void setPrecioRecurso1(int recurso, int precio) {
        this.recurso=recurso;
        this.precio=precio;
    }

    @Override
    public void setPrecioRecurso2(int recurso1, int precio1) {
        this.precio1=precio1;
        this.recurso1=recurso1;
    }

    @Override
    public void setFase(int fase) {
        this.fase= fase;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getVida() {
        return this.vida;
    }

    @Override
    public String getRaza() {
        return this.raza;
    }

    @Override
    public int[] getCPrecioRecurso1() {
        int[] precio = new int[1];
        precio[0] = this.recurso;
        precio[1] = this.precio;
        return precio;
    }

    @Override
    public int[] getPrecioRecurso2() {
        int[] precio = new int[1];
        precio[0] = this.recurso1;
        precio[1] = this.precio1;
        return precio;
    }

    @Override
    public int getFase() {
        return this.fase;
    }

}
