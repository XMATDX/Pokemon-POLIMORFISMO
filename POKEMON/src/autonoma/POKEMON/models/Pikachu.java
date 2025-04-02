/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 * Representa un Pikachu, una subclase de Pokemon que implementa la interfaz 
 * PokemonElectrico, lo que le permite ejecutar ataques eléctricos específicos.
 *
 * @author Maribel Ceballos <maribel.ceballosc@autonoma.edu.co>
 * @version 0.1
 * @since 2025/03/31
 */
public class Pikachu extends Pokemon implements PokemonElectrico {

    /**
     * Constructor que inicializa un Pikachu con sus atributos específicos.
     *
     * @param numPOkedex Número en la Pokédex del Pokémon.
     * @param nombre Nombre del Pokémon.
     * @param peso Peso del Pokémon en kilogramos.
     * @param temporada Temporada en la que apareció el Pokémon.
     */
    public Pikachu(int numPOkedex, String nombre, double peso, int temporada) {
        super(numPOkedex, nombre, peso, temporada);
    }

    /**
     * Constructor por defecto de Pikachu.
     */
    public Pikachu() {
    }

    /**
     * Realiza el ataque Impactrueno.
     *
     * @return Mensaje indicando que Pikachu está usando Impactrueno.
     */
    @Override
    public String atacarImpactrueno() {
        return "Soy Pikachu y estoy atacando con Impactrueno";
    }

    /**
     * Realiza el ataque Puño Trueno.
     *
     * @return Mensaje indicando que Pikachu está usando Puño Trueno.
     */
    @Override
    public String atacarPunioTrueno() {
        return "Soy Pikachu y estoy atacando con Puño Trueno";
    }

    /**
     * Realiza el ataque Rayo.
     *
     * @return Mensaje indicando que Pikachu está usando Rayo.
     */
    @Override
    public String atacarRayo() {
        return "Soy Pikachu y estoy atacando con Rayo";
    }

    /**
     * Realiza el ataque Rayo Carga.
     *
     * @return Mensaje indicando que Pikachu está usando Rayo Carga.
     */
    @Override
    public String atacarRayoCarga() {
        return "Soy Pikachu y estoy atacando con Rayo Carga"; 
    }
}
