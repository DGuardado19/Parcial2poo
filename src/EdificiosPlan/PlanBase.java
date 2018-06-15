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
public interface PlanBase {

    public void setNombre(String name);

    public void setVida(int life);

    public void setRecursos (int Cap1, int Cap2, int Cap3);

    public void setCantidadRecurso(int Recu1, int Recu2, int Recu3);

    public String getNombre();

    public int getVida();

    public int[] getCapacidadAlmacenamiento();

    public int[] getTotalRecurso();
}
