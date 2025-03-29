/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 * Clase padre de los pokemones
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/03/31
 * @see     autonoma.POKEMON.models
 */
public class Pokemon {

    //////////////////////////////////
    /// Atributos
    
    /**
     * Numero en la pokedex del pokemon.
     */
    private int numPokedex;
    
    /**
    * Nombre del pokemon.
    */
    private String nombre;
    
    /**
    * Peso del pokemon.
    */
    private double peso;
    
    /**
    * Temporada del pokemon.
    */
    private int temporada;

    
    
    //////////////////////////////////
    /// Constructor
    
    /**
     * Constructor de la clase Amigo.
     * 
     * @param numPOkedex   Numero en la pokedex del pokemon.
     * @param telefono Numero de telefono del amigo
     * @param correo   Correo electronico del amigo
     */
    public Pokemon(int numPOkedex, String nombre, double peso, int temporada) {
        this.numPokedex = numPOkedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }

    
    //////////////////////////////////
    /// Metodos de acceso
    
    /**
     * Obtiene numero de pokedex del pokemon.
     * 
     * @return numPOkedex del pokemon
     */
    public int getNumPOkedex() {
        return numPokedex;
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
        this.numPokedex = numPOkedex;
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
