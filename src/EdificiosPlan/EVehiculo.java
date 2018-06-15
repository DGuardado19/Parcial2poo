/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificiosPlan;

import VehiculosyTropas.Vehi;
import VehiculosyTropas.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class EVehiculo implements PlanVehiculos {

    public ArrayList<EVehiculo> EVehiculo = new ArrayList<>();
    public ArrayList<Vehi> Vehiculo = new ArrayList<>();
    public String nombre, raza, tipoDeVehiculo;
    public int recurso, recurso1, vida, fase, precio, precio1, edificio, tipo;

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
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    @Override
    public int getEdificio() {
        return this.edificio;
    }

    @Override
    public void setPrecio(int recurso, int costo) {
        this.recurso = recurso;
        this.precio = costo;
    }

    @Override
    public void setPrecio1(int recurso1, int costo1) {
        this.recurso1 = recurso1;
        this.precio1 = costo1;
    }

    @Override
    public void setFase(int fase) {
        this.fase = fase;
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

    @Override
    public int getFase() {
        return this.fase;
    }

    @Override
    public ArrayList<Vehi> getVehiculo() {
        return this.Vehiculo;
    }

}
