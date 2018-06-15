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
public interface PlanCuartel {
     public void setNombre(String nombre);
    public void setVida(int vida);
    public void setRaza(String raza);
    public void setPrecioRecurso1 (int recurso, int precio);
    public void setPrecioRecurso2 (int recurso1, int precio1);
    public void setFase (int fase);
    
    public String getNombre();
    public int getVida();
    public String getRaza();
    public int[] getCPrecioRecurso1();
    public int[] getPrecioRecurso2();
    public int getFase();
}
