/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 * Interfaz que define los ataques de tipo Eléctrico que pueden ejecutar ciertos Pokémon.
 * Cualquier clase que implemente esta interfaz debe proporcionar la implementación
 * de los métodos de ataque eléctrico.
 *
 * @author Maribel Ceballos <maribel.ceballosc@gmail.com>
 * @version 1.0
 * @since 2025/04/01
 */
public interface PokemonElectrico {

    /**
     * Ejecuta el ataque Impactrueno.
     *
     * @return Mensaje indicando que el Pokémon está usando Impactrueno.
     */
    public abstract String atacarImpactrueno();

    /**
     * Ejecuta el ataque Puño Trueno.
     *
     * @return Mensaje indicando que el Pokémon está usando Puño Trueno.
     */
    public abstract String atacarPunioTrueno();

    /**
     * Ejecuta el ataque Rayo.
     *
     * @return Mensaje indicando que el Pokémon está usando Rayo.
     */
    public abstract String atacarRayo();

    /**
     * Ejecuta el ataque Rayo Carga.
     *
     * @return Mensaje indicando que el Pokémon está usando Rayo Carga.
     */
    public abstract String atacarRayoCarga();
}
