/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.backend;

import proyecto1.backend.Jugador;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author joses
 */
public class ControladorTurno {

    private Jugador jugador1;
    private Jugador jugador2;
    private int turno;

    public Jugador iniciarTurno(Jugador jugador1, Jugador jugador2) {

        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.turno = 0;
        return obtenerTurno();
    }

    public Jugador obtenerTurno() {
        if (this.turno == 0) {
            return this.jugador1;
        }
        return this.jugador2;
    }

    public Jugador cambiarTurno() {

        this.turno = this.turno == 0 ? 1 : 0;

        return obtenerTurno();
    }

}
