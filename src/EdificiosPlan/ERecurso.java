/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificiosPlan;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class ERecurso implements PlanRecursos {

    public String name, r;
    public int cantidad, vid, max, fase, precio, precio1, recurso, recurso1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 

    public void setPrecio(int precio) {
        this.precio = precio;
    }



    public void setPrecio1(int precio1) {
        this.precio1 = precio1;
    }

    public int getRecurso() {
        return recurso;
    }

    public void setRecurso(int recurso) {
        this.recurso = recurso;
    }

    public int getRecurso1() {
        return recurso1;
    }

    public void setRecurso1(int recurso1) {
        this.recurso1 = recurso1;
    }

    @Override
    public String getNombre() {
        return this.name;
    }

    @Override
    public int getVida() {
        return this.vid;
    }

    @Override
    public int getCantidad() {
        return this.cantidad;
    }

    @Override
    public String getRaza() {
        return this.r;
    }

    @Override
    public int getMax() {
        return this.max;
    }

    @Override
    public int getFase() {
        return this.fase;
    }

    @Override
    public void setNombre(String name) {
        this.name = name;
    }

    @Override
    public void setVida(int vid) {
        this.vid = vid;
    }

    @Override
    public void setCantidad(int Cantidad) {
        this.cantidad= Cantidad;
    }

    @Override
    public void setRaza(String r) {
        this.r = r;
    }

    @Override
    public void setMax(int max) {
       this.max= max;
    }

    @Override
    public void setFase(int fase) {
        this.fase= fase;
    }

    @Override
    public void setPrecio1(int recurso, int precio) {
        this.recurso1= recurso;
        this.precio1= precio;
    }

   

    @Override
    public void setPrecio(int recurso, int precio) {
        this.recurso=recurso;
        this.precio=precio;
    }

    
    @Override
    public int[] getPrecio2() {
        int[] precio = new int[1];
        precio[0] = this.recurso1;
        precio[1] = this.precio1;
        return precio;
    }

    @Override
    public int[] getPrecio1() {
        int[] precio = new int[1];
        precio[0] = this.recurso;
        precio[1] = this.precio;
        return precio;
    }

}
