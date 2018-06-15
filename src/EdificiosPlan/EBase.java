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
public class EBase implements PlanBase {

    public ArrayList<EBase> Ebase = new ArrayList<>();
    public String nombre, raza;
    public int vida, Cap1, Cap2, Cap3, rec1, rec2, rec3;

    @Override
    public void setNombre(String name) {
        this.nombre = name;
    }

    @Override
    public void setVida(int life) {
        this.vida = life;
    }

    @Override
    public void setRecursos(int Cap1, int Cap2, int Cap3) {
        this.Cap1 = Cap1;
        this.Cap2 = Cap2;
        this.Cap3 = Cap3;
    }

    @Override
    public void setCantidadRecurso(int Recu1, int Recu2, int Recu3) {
        this.rec1 = Recu1;
        this.rec2 = Recu2;
        this.rec3 = Recu3;
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
    public int[] getCapacidadAlmacenamiento() {
          int[] cap = new int[2];
        cap[0] = this.Cap1;
        cap[1] = this.Cap2;
        cap[2] = this.Cap3;
        return cap;
    }

    @Override
    public int[] getTotalRecurso() {
        int[] rec = new int[2];
        rec[0] = this.rec1;
        rec[1] = this.rec2;
        rec[2] = this.rec3;
        return rec;
    }

}
