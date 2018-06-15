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
public interface PlanTropas {
    public void setNombre(String nombre);
    public void setRaza(String raza);
    public void setFase(int fase);
    public void setVida(int vida);
    public void setAtaque(int ataque);
    public void setPrecio(int recurso, int precio);
    public void setPrecio1(int recurso, int precio);
    
    public String getNombre();
    public String getRaza();
    public int getFase();
    public int getVida();
    public int getAtaque();
    public int[] getPrecio();
    public int[] getPrecio1();
}
