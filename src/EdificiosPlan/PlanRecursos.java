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
public interface PlanRecursos {

    public String getNombre();

    public int getVida();

    public int getCantidad();

    public String getRaza();

    public int getMax();

    public int getFase();

    public void setNombre(String name);

    public void setVida(int vid);

    public void setCantidad(int Cantidad);

    public void setRaza(String r);

    public void setMax(int max);

    public void setFase(int fase);

    public void setPrecio1(int recurso, int precio);

    public void setPrecio(int recurso, int precio);

    public int[] getPrecio1();

    public int[] getPrecio2();

}
