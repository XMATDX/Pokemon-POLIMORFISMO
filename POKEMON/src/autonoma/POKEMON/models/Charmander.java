/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 * Representa un Charmander, una subclase de Pokemon que implementa la interfaz 
 * PokemonFuego, lo que le permite ejecutar ataques de tipo fuego específicos.
 *
 * @author Maribel Ceballos <maribel.ceballosc@gmail.com>
 * @version 1.0
 * @since 2025/04/01
 */
public class Charmander extends Pokemon implements PokemonFuego {

    /**
     * Constructor que inicializa un Charmander con sus atributos específicos.
     *
     * @param numPOkedex Número en la Pokédex del Pokémon.
     * @param nombre Nombre del Pokémon.
     * @param peso Peso del Pokémon en kilogramos.
     * @param temporada Temporada en la que apareció el Pokémon.
     */
    public Charmander(int numPOkedex, String nombre, double peso, int temporada) {
        super(numPOkedex, nombre, peso, temporada);
    }

    /**
     * Constructor por defecto de Charmander.
     */
    public Charmander() {
    }

    /**
     * Realiza el ataque Puño Fuego.
     *
     * @return Mensaje indicando que Charmander está usando Puño Fuego.
     */
    @Override
    public String atacarPunioFuego() {
        return "Soy Charmander y estoy atacando con Puño Fuego";
    }

    /**
     * Realiza el ataque Ascuas.
     *
     * @return Mensaje indicando que Charmander está usando Ascuas.
     */
    @Override
    public String atacarAscuas() {
        return "Soy Charmander y estoy atacando con Ascuas";
    }

    /**
     * Realiza el ataque Lanzallamas.
     *
     * @return Mensaje indicando que Charmander está usando Lanzallamas.
     */
    @Override
    public String atacarLanzallamas() {
        return "Soy Charmander y estoy atacando con Lanzallamas";
    }
}