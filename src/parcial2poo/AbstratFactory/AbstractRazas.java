/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2poo.AbstratFactory;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public interface AbstractRazas {

    public RazasInterface getDemacia(int s);

    public RazasInterface getNoxus(int s);

    public RazasInterface getVacio(int s);

}
