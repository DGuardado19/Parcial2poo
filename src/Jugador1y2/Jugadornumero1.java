/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador1y2;

import Demacia.AbstractDemaciaTropas;
import Demacia.AbstractDemaciaVehiculos;
import Demacia.FactoryDemacia;
import EdificiosPlan.EBase;
import EdificiosPlan.ECuartel;
import EdificiosPlan.ERecurso;
import EdificiosPlan.EVehiculo;
import Noxus.AbstractNoxusTropas;
import Noxus.AbstractNoxusVehiculos;
import Noxus.FactoryNoxus;
import Vacio.AbstractVacioTropas;
import Vacio.AbstractVacioVehiculos;
import Vacio.FactoryVacio;
import VehiculosyTropas.Tropa;
import VehiculosyTropas.Vehi;
import java.util.ArrayList;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class Jugadornumero1 {

    private int raza;
    private String nombre;

    private ArrayList<Tropa> tropa = new ArrayList<>();
    private ArrayList<Vehi> vehi = new ArrayList<>();
    private ArrayList<EBase> base = new ArrayList<>();
    private ArrayList<ECuartel> cuartel = new ArrayList<>();
    private ArrayList<EVehiculo> evehi = new ArrayList<>();
    private ArrayList<ERecurso> recurso = new ArrayList<>();
    private int r;

    private static Jugadornumero1 jugador = new Jugadornumero1();

    public static Jugadornumero1 getInstance() {
        if (jugador == null) {
            jugador = new Jugadornumero1();
        }
        return jugador;
    }

    public void setR(int r) {
        this.r = r;
    }

    public ArrayList<EBase> getBase() {
        return base;
    }

    public ArrayList<ECuartel> getCuartel() {
        return cuartel;
    }

    public ArrayList<EVehiculo> getVehi() {
        return evehi;
    }

    public ArrayList<ERecurso> getRecurso() {
        return recurso;
    }

    public int getR() {
        return r;
    }

    public static Jugadornumero1 getJugador() {
        return jugador;
    }

    public ArrayList<Tropa> getTropa() {
        return tropa;
    }

    public ArrayList<Vehi> getVehic() {
        return vehi;
    }

    public void guardarTropas(int Tropa, Jugadornumero1 jugador) {
        AbstractDemaciaTropas dema = new AbstractDemaciaTropas();
        AbstractNoxusTropas nox = new AbstractNoxusTropas();
        AbstractVacioTropas vac = new AbstractVacioTropas();
        switch (jugador.getR()) {
            case 1://ballas
                dema.getDemaciaTropas(Tropa).crearTropas();
                Tropa trop1 = dema.getDemaciaTropas(Tropa).getInstance();
                jugador.getTropa().add(trop1);
                break;
            case 2://Families
                nox.getDemaciaTropas(Tropa).crearTropas();
                Tropa trop = nox.getNoxusTropas(Tropa).getInstance();
                jugador.getTropa().add(trop);
                break;
            case 3://Vagos
                vac.getDemaciaTropas(Tropa).crearTropas();
                Tropa tro = dema.getVacioTropas(Tropa).getInstance();
                jugador.getTropa().add(tro);
                break;
        }
    }

    public void BaseGuardar(Jugadornumero1 jugador) {
        FactoryDemacia dema = new FactoryDemacia();
        FactoryNoxus nox = new FactoryNoxus();
        FactoryVacio vac = new FactoryVacio();
        switch (jugador.getR()) {
            case 1:
                dema.getDemacia(1).CrearEBase();
                EBase basee = dema.getDemacia(1).InstanciaBase();
                jugador.getBase().add(basee);
                break;
            case 2:
                nox.getNoxus(1).CrearEBase();
                EBase baseNox = nox.getNoxus(1).InstanciaBase();
                jugador.getBase().add(baseNox);
                break;
            case 3:
                vac.getVacio(1).CrearEBase();
                EBase baseVac = vac.getVacio(1).InstanciaBase();
                jugador.getBase().add(baseVac);
                break;
        }
    }

    public void Edificaciones(Jugadornumero1 jugador) {
        System.out.println("");
        if (jugador.getBase().size() > 0) {
            System.out.println("--------Base!--------");
            System.out.println(jugador.getBase().get(0).getNombre());
            System.out.println(jugador.getBase().get(0).getVida());
        }

        if (jugador.getRecurso().size() > 0) {
            System.out.println("-----Estos osn los recursos-----");
            for (int i = 0; i < jugador.getRecurso().size(); i++) {
                System.out.println(jugador.getRecurso().get(i).getNombre());
                System.out.println(jugador.getRecurso().get(i).getVida());
                System.out.println(jugador.getRecurso().get(i).getCantidad());
            }
        }

        if (jugador.getCuartel().size() > 0) {
            System.out.println("-----cUARTELES TROPAS----");
            for (int i = 0; i < jugador.getTropa().size(); i++) {
                System.out.println(jugador.getTropa().get(i).getNombre());
                System.out.println(jugador.getTropa().get(i).getVida());
            }
        }

        if (jugador.getVehi().size() > 0) {
            System.out.println("---Fabricas de vehiculos---");
            for (int i = 0; i < jugador.getVehi().size(); i++) {
                System.out.println(jugador.getVehi().get(i).getNombre());
                System.out.println(jugador.getVehi().get(i).getVida());
            }
        }

    }

    public void GuardarVehi(Jugadornumero1 jugador, int vehi) {
        AbstractDemaciaVehiculos dema = new AbstractDemaciaVehiculos();
        AbstractNoxusVehiculos nox = new AbstractNoxusVehiculos();
        AbstractVacioVehiculos vac = new AbstractVacioVehiculos();
        switch (jugador.getR()) {
            case 1://ballas
                dema.geDemaciaVehi(vehi).crearVehiculos();
                Vehi ve = dema.geDemaciaVehi(vehi).Instancia();
                jugador.getVehic().add(ve);
                break;
            case 2://Families
                nox.getNoxusVehi(vehi).crearVehiculos();
                Vehi veh = nox.getNoxusVehi(vehi).Instancia();
                jugador.getVehic().add(veh);
                break;
            case 3://Vagos
                vac.getVacioVehi(vehi).crearVehiculos();
                Vehi vehic = vac.getVacioVehi(vehi).Instancia();
                jugador.getVehic().add(vehic);
                break;
        }
    }

    public void mostrarAtaques(Jugadornumero1 jugador) {
        System.out.println("---Cuenta con estras tropas, comandante-----");
        for (int j = 0; j < jugador.getTropa().size(); j++) {
            System.out.println((j + 1) + " - <" + jugador.getTropa().get(j).getNombre());
            System.out.println("ad: " + jugador.getTropa().get(j).getAtaque());
            System.out.println("VidA: " + jugador.getTropa().get(j).getVida());

        }
        System.out.println("---Cuenta con estras vehiculos, comandante-----");
        for (int j = 0; j < jugador.getVehic().size(); j++) {
            System.out.println((j + 1) + " ->" + jugador.getVehic().get(j).getNombre() + jugador.getVehic().get(j).getRaza());
            System.out.println("ad: " + jugador.getVehic().get(j).getDamage());
            System.out.println("VidaA: " + jugador.getVehic().get(j).getVida());

        }

    }

    public void generarRecursos(Jugadornumero1 jugador) {
        int sum;
        for (int i = 0; i < jugador.getRecurso().size(); i++) {
            if (jugador.getRecurso().get(i).getFase() == 0) {
                sum = jugador.getRecurso().get(i).getCantidad() + 2000;
                if (sum <= jugador.getRecurso().get(i).getMax()) {
                    jugador.getRecurso().get(i).setCantidad(sum);
                }
            }
        }
    }

    public void ERecursosGuardar(int e, Jugadornumero1 jugador) {
        FactoryDemacia dema = new FactoryDemacia();
        FactoryNoxus nox = new FactoryNoxus();
        FactoryVacio vac = new FactoryVacio();
        switch (jugador.getR()) {
            case 1://ballas
                dema.getDemacia(e).CrearERecurso();
                ERecurso recu = dema.getDemacia(e).InstanciaRecurso();
                jugador.getRecurso().add(recu);
                break;
            case 2://Families
                nox.getNoxus(e).CrearERecurso();
                ERecurso recunox = nox.getNoxus(e).InstanciaRecurso();
                jugador.getRecurso().add(recunox);
                break;
            case 3://Vagos
                vac.getVacio(e).CrearERecurso();
                ERecurso recuvac = vac.getVacio(e).InstanciaRecurso();
                jugador.getRecurso().add(recuvac);
                break;
        }
    }

    public void crearEdificiosFases(Jugadornumero1 jugador) {
        for (int i = 0; i < jugador.getRecurso().size(); i++) {
            int cont = jugador.getRecurso().get(i).getFase();
            if (jugador.getRecurso().get(i).getFase() != 0) {
                jugador.getRecurso().get(i).setFase(cont - 1);
                if (jugador.getRecurso().get(i).getFase() == 0) {
                    System.out.println("El edificio fue creado: " + jugador.getRecurso().get(i).getNombre());
                }
            }
        }
        for (int i = 0; i < jugador.getCuartel().size(); i++) {
            int cont = jugador.getCuartel().get(i).getFase();
            if (jugador.getCuartel().get(i).getFase() != 0) {
                jugador.getCuartel().get(i).setFase(cont - 1);
                if (jugador.getCuartel().get(i).getFase() == 0) {
                    System.out.println("El edificio fue creado: " + jugador.getCuartel().get(i).getNombre());
                }
            }
        }
        for (int i = 0; i < jugador.getVehi().size(); i++) {
            int num = jugador.getVehi().get(i).getFase();
            if (jugador.getVehi().get(i).getFase() != 0) {
                jugador.getVehi().get(i).setFase(num - 1);
                if (jugador.getVehi().get(i).getFase() == 0) {
                    System.out.println("El edificio fue creado: " + jugador.getVehi().get(i).getNombre());
                }
            }
        }
        for (int i = 0; i < jugador.getTropa().size(); i++) {
            int num = jugador.getTropa().get(i).getFase();
            if (jugador.getTropa().get(i).getFase() != 0) {
                jugador.getTropa().get(i).setFase(num - 1);
                if (jugador.getTropa().get(i).getFase() == 0) {
                    System.out.println("Tropa creada: " + jugador.getTropa().get(i).getNombre());
                }
            }
        }
        for (int i = 0; i < jugador.getVehic().size(); i++) {
            int num = jugador.getVehic().get(i).getFase();
            if (jugador.getVehic().get(i).getFase() != 0) {
                jugador.getVehic().get(i).setFase(num - 1);
                if (jugador.getVehic().get(i).getFase() == 0) {
                    System.out.println("Vehiculo locos alv creado: " + jugador.getVehic().get(i).getNombre());
                }
            }
        }
    }

    public void recolectarRecursos(Jugadornumero1 jugador) {
        int re, recu, recur;
       re = jugador.getBase().get(0).getTotalRecurso()[0];
        recu = jugador.getBase().get(0).getTotalRecurso()[1];
        recur = jugador.getBase().get(0).getTotalRecurso()[2];
        for (int i = 0; i < jugador.getRecurso().size(); i++) {
            if (jugador.getRecurso().get(i).getMax() == 10000) {
                re = jugador.getBase().get(0).getTotalRecurso()[0] + jugador.getRecurso().get(i).getCantidad();
            }
            if (jugador.getRecurso().get(i).getCantidad() == 5000) {
                recu = jugador.getBase().get(0).getTotalRecurso()[1] + jugador.getRecurso().get(i).getCantidad();
            }
            if (jugador.getRecurso().get(i).getCantidad() == 3000) {
                recur = jugador.getBase().get(0).getTotalRecurso()[2] + jugador.getRecurso().get(i).getCantidad();
            }
            jugador.getBase().get(0).setCantidadRecurso(re, recu, recur);
            jugador.getRecurso().get(i).setCantidad(0);
        }
    }

}
