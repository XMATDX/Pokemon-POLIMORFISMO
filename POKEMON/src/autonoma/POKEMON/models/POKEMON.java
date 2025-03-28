/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 *
 * @author mateo
 */
public class Pokemon {

    private int numPOkedex;
    private String nombre;
    private double peso;
    private int temporada;

    public Pokemon(int numPOkedex, String nombre, double peso, int temporada) {
        this.numPOkedex = numPOkedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }

    public int getNumPOkedex() {
        return numPOkedex;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setNumPOkedex(int numPOkedex) {
        this.numPOkedex = numPOkedex;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    
    
    
    
}
