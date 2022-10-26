/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielgarcia.Logica;

/**
 *
 * @author damB
 */
public class Partido {
    private String Equipo1;
    private String Equipo2;
    private int GolesEquipo1;
    private int GolesEquipo2;

    public Partido(String Equipo1, String Equipo2, int GolesEquipo1, int GolesEquipo2) {
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.GolesEquipo1 = GolesEquipo1;
        this.GolesEquipo2 = GolesEquipo2;
    }
    
    

    public String getEquipo1() {
        return Equipo1;
    }

    public void setEquipo1(String Equipo1) {
        this.Equipo1 = Equipo1;
    }

    public String getEquipo2() {
        return Equipo2;
    }

    public void setEquipo2(String Equipo2) {
        this.Equipo2 = Equipo2;
    }

    public int getGolesEquipo1() {
        return GolesEquipo1;
    }

    public void setGolesEquipo1(int GolesEquipo1) {
        this.GolesEquipo1 = GolesEquipo1;
    }

    public int getGolesEquipo2() {
        return GolesEquipo2;
    }

    public void setGolesEquipo2(int GolesEquipo2) {
        this.GolesEquipo2 = GolesEquipo2;
    }
    
    
    
}
