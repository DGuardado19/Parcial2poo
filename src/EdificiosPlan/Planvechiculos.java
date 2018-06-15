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
interface Planvechiculos {

    public String getNombre();

    public int getVida();

    public String getRaza();

    public String getTipoDeVehiculo();

    public int[] getPrecio();

    public int[] getPrecio1();

    public int getFase();

    public void setNombre(String nombre);

    public void setVida(int vida);

    public void setRaza(String raza);

    public void setTipoDeVehiculo(String tipo);

    public void setPrecio(int recurso, int precio);

    public void setPrecio1(int recurso1, int precio1);

    public void setFase(int fase);

}
