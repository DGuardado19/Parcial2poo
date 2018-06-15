/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import Demacia.AbstractDemaciaVehiculos;
import Jugador1y2.Jugadornumero1;
import Noxus.AbstractNoxusVehiculos;
import Vacio.AbstractVacioVehiculos;
import java.util.Scanner;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class Menusambosjugadores {

    Jugadornumero1 jugador = new Jugadornumero1();
    Jugadornumero1 jugador2 = new Jugadornumero1();
    public int fase = 1;

    public void menuEleccion() {
        Scanner leer = new Scanner(System.in);
        int raza;
        String nombre;
        System.out.println("----------- Jugador1 -----------");
        System.out.print("Selecciona una raza /1.Demacia 2.Noxus 3.Vacio/: ");
        raza = leer.nextInt();
        jugador.setR(raza);
        jugador.BaseGuardar(jugador);

        System.out.println("-------- Jugador2----------");

        System.out.print("Selecciona una raza /1.Demacia 2.Noxus 3.Vacio/: ");
        raza = leer.nextInt();
        jugador2.setR(raza);
        jugador2.BaseGuardar(jugador2);

    }

    public void menuEdificaciones(Jugadornumero1 jugador) {
        int opc = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("3- Compra edificación recurso de tipo1");
        System.out.println("4- Compra edificación recurso de tipo2");
        System.out.println("5- Compra edificación recurso de tipo3");
        System.out.println("6- Compra una fabrica de vehiculos tipo1");
        System.out.println("7- Compra una fabrica de vehiculos tipo2");
        System.out.println("8- Compra un Cuartel para crear tropas");
        System.out.println("9- Regresar");
        System.out.print("Opción: ");
        opc = leer.nextInt();
        switch (opc) {
            case 3:
                jugador.ERecursosGuardar(opc, jugador);
                break;
            case 4:
                jugador.ERecursosGuardar(opc, jugador);
                break;
            case 5:
                jugador.ERecursosGuardar(opc, jugador);
                break;
            case 6:
                jugador.GuardarVehi(jugador, opc);
                break;
            case 7:
                jugador.GuardarVehi(jugador, opc);
                break;
            case 8:
                jugador.GuardarVehi(jugador, opc);
                break;
            case 9:
                menuparajugador1(jugador);
                break;
        }
    }

    public void menuCarritos(Jugadornumero1 jugador) {
        AbstractDemaciaVehiculos dema = new AbstractDemaciaVehiculos();
        AbstractNoxusVehiculos nox = new AbstractNoxusVehiculos();
        AbstractVacioVehiculos vacio = new AbstractVacioVehiculos();
        int opc2;
        Jugadornumero1 ju = new Jugadornumero1();
        Scanner leer = new Scanner(System.in);
        System.out.println("Que vehiculo quieres general ?");
        switch (jugador.getR()) {
            case 1:
                dema.geDemaciaVehi(1).crearVehiculos();
                dema.geDemaciaVehi(2).crearVehiculos();
                System.out.println("1 - " + dema.geDemaciaVehi(1).Instancia().getNombre());
                System.out.println("1 - " + dema.geDemaciaVehi(2).Instancia().getNombre());
                break;
            case 2:
                nox.getNoxusVehi(1).crearVehiculos();
                nox.getNoxusVehi(2).crearVehiculos();
                System.out.println("1 - " + dema.getNoxusVehi(1).Instancia().getNombre());
                System.out.println("1 - " + dema.getNoxusVehi(2).Instancia().getNombre());
                break;
            case 3:
                 vacio.getVacioVehi(1).crearVehiculos();
                vacio.getVacioVehi(2).crearVehiculos();
                System.out.println("1 - " + dema.getVacioVehi(1).Instancia().getNombre());
                System.out.println("1 - " + dema.getVacioVehi(2).Instancia().getNombre());
                break;
        }
        System.out.print("Opcion: ");
        opc2 = leer.nextInt();
        ju.GuardarVehi(jugador, opc2);
    }

    public void menuparajugador1(Jugadornumero1 ju) {
        int opc;
        Jugadornumero1 juga = new Jugadornumero1();
        Scanner leer = new Scanner(System.in);

        System.out.println("----------- "  + " -----------");
        System.out.println("---------------------------------\n");
        System.out.println("1- Crear Edificios");
        System.out.println("2- Mostrar las edificaciones");
        System.out.println("3- Crea tropas");
        System.out.println("4- Ver estado detus tropas");
        System.out.println("5- ataca y defiende tu base");
        System.out.println("6- fabrica vehiculos");
        System.out.println("7- cosnigue los recursos de tu bases");
   
        System.out.println("9- Terminar turno, turno del siguiente jugador");
        System.out.print("Opción: ");
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                menuEdificaciones(ju);
                menuparajugador1(ju);
                break;
            case 2:
                ju.Edificaciones(ju);
                menuparajugador1(ju);
                break;
            case 3:
                if (ju.getCuartel().size() > 0 && ju.getTropa().size() <= 10 * (ju.getCuartel().size())) {
                    menuTropas(ju);
                } else {
                    System.out.println("\nNo se pueden crear tropas sin el edificio de entrenamiento");
                }
                menuparajugador1(ju);
                break;
            case 4:
                ju.mostrarAtaques(ju);
                menuparajugador1(ju);
                break;
            case 5:
                break;
            case 6:
                if (ju.getVehi().size() > 0 && ju.getVehic().size() <= 10 * (ju.getVehi().size())) {
                    menuCarritos(ju);
                } else {
                    System.out.println("\nNo se pueden crear tropas sin el edificio de entrenamiento");
                }
                menuparajugador1(ju);
                break;
            case 7:
                juga.recolectarRecursos(ju);
                menuparajugador1(ju);
                break;
            case 9:
                if (jugador == ju) {
                    menuparajugador1(jugador2);
                } else {
                    System.out.println("-------------FASE " + fase + "---------------");
                    fase++;
                    juga.generarRecursos(jugador);
                    juga.generarRecursos(jugador2);
                    juga.crearEdificiosFases(jugador);
                    juga.crearEdificiosFases(jugador2);
                    menuparajugador1(jugador2);
                }
                break;
        }
    }

    public void menuTropas(Jugadornumero1 jugador) {
        int opc2;
        Scanner leer = new Scanner(System.in);
        Jugadornumero1 jugadorsito = new Jugadornumero1();

        System.out.println("Que creamos amigo?");
        System.out.println("1- Escuadron");
        System.out.println("2- Especialista bien prron");
        System.out.print("Que deseas: ");
        opc2 = leer.nextInt();
        jugadorsito.guardarTropas(opc2, jugador);
    }
    public void turnos(){
        Menusambosjugadores menu = new Menusambosjugadores();
        int turno = (int)(Math.random() * 2)+1;
        if(turno == 1){
            menu.menuparajugador1(jugador);
        }else{
            menu.menuparajugador1(jugador2);
        }
        
    }
}
