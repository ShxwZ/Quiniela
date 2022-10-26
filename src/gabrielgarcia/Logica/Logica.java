/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielgarcia.Logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author damB
 */
public class Logica {
    public static int devolverFilaSeleccionada(int matrix [][], int fila){
        for (int i = 0; i < matrix[fila].length; i++) {
            if (matrix[fila][0] != 0) {
                return i;
            }
        }
        return 0;
    }
    public static List<Partido> generarPartidos(String [] Equipos, int nPartidos){
        List<Partido> p = new ArrayList<>();
        for (int i = 0; i < nPartidos; i++) {
            String equipo1 = "";
            String equipo2 = "";
            while (equipo1.equals(equipo2)) {
                equipo1 = Equipos[getRandomNumberRange(1, Equipos.length-1)];
                equipo2 = Equipos[getRandomNumberRange(1, Equipos.length-1)];
            }
            p.add(new Partido(equipo1, equipo2,getRandomNumberRange(0, 10),getRandomNumberRange(0, 10)));
        }
        return p;
    } 
    public static int getRandomNumberRange(int max, int min){
        return (int) ((Math.random() * (max - min)) + min);
    }
}
