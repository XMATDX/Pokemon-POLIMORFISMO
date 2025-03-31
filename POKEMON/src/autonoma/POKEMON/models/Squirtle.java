/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 *
 * @author mateo
 */
public class Squirtle extends Pokemon implements PokemonAgua{

    public Squirtle(int numPOkedex, String nombre, double peso, int temporada) {
        super(numPOkedex, nombre, peso, temporada);
    }

    @Override
    public String atacarHidrobomba() {
        return ("Soy Squirtle y estoy atacando con Hidrobomba"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String atacarPistolaAgua() {
        return ("Soy Squirtle y estoy atacando con PistolaAgua"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String atacarBurbuja() {
        return ("Soy Squirtle y estoy atacando con Burbuja"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String atacarHidropulso() {
        return ("Soy Squirtle y estoy atacando con Hidropulso"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
