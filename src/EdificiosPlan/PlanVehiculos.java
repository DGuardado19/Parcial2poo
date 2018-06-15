/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificiosPlan;

import VehiculosyTropas.Vehi;
import java.util.ArrayList;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public interface PlanVehiculos {

     public void setNombre(String nombre);
    public void setVida(int vida);
    public void setRaza(String raza);

    public void setPrecio(int recurso, int costo);
    public void setPrecio1(int recurso1, int costo1);
    public void setFase(int fase);
    public void setEdificio(int edificio);
    
    public String getNombre();
    public int getVida();
    public String getRaza();

    public int[] getPrecio();
    public int[] getPrecio1();
    public int getFase();
    public ArrayList<Vehi> getVehiculo(); 
    public int getEdificio();
}
