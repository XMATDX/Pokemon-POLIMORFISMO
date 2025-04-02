/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 * Representa un Squirtle, una subclase de Pokemon que implementa la interfaz 
 * PokemonAgua, lo que le permite ejecutar ataques de tipo agua específicos.
 *
 * @author Maribel Ceballos <maribel.ceballosc@autonoma.edu.com>
 * @version 1.0
 * @since 2025/04/01
 */
public class Squirtle extends Pokemon implements PokemonAgua {

    /**
     * Constructor que inicializa un Squirtle con sus atributos específicos.
     *
     * @param numPOkedex Número en la Pokédex del Pokémon.
     * @param nombre Nombre del Pokémon.
     * @param peso Peso del Pokémon en kilogramos.
     * @param temporada Temporada en la que apareció el Pokémon.
     */
    public Squirtle(int numPOkedex, String nombre, double peso, int temporada) {
        super(numPOkedex, nombre, peso, temporada);
    }

    /**
     * Constructor por defecto de Squirtle.
     */
    public Squirtle() {
    }

    /**
     * Realiza el ataque Hidrobomba.
     *
     * @return Mensaje indicando que Squirtle está usando Hidrobomba.
     */
    @Override
    public String atacarHidrobomba() {
        return "Soy Squirtle y estoy atacando con Hidrobomba";
    }

    /**
     * Realiza el ataque Pistola Agua.
     *
     * @return Mensaje indicando que Squirtle está usando Pistola Agua.
     */
    @Override
    public String atacarPistolaAgua() {
        return "Soy Squirtle y estoy atacando con Pistola Agua";
    }

    /**
     * Realiza el ataque Burbuja.
     *
     * @return Mensaje indicando que Squirtle está usando Burbuja.
     */
    @Override
    public String atacarBurbuja() {
        return "Soy Squirtle y estoy atacando con Burbuja";
    }

    /**
     * Realiza el ataque Hidropulso.
     *
     * @return Mensaje indicando que Squirtle está usando Hidropulso.
     */
    @Override
    public String atacarHidropulso() {
        return "Soy Squirtle y estoy atacando con Hidropulso";
    }
}