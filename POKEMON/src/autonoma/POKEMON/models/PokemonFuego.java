/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 * Interfaz que define los ataques de tipo Fuego que pueden ejecutar ciertos Pokémon.
 * Cualquier clase que implemente esta interfaz debe proporcionar la implementación
 * de los métodos de ataque de fuego.
 *
 * @author Maribel Ceballos <maribel.ceballosc@gmail.com>
 * @version 1.0
 * @since 2025/04/01
 */
public interface PokemonFuego {

    /**
     * Ejecuta el ataque Puño Fuego.
     *
     * @return Mensaje indicando que el Pokémon está usando Puño Fuego.
     */
    public abstract String atacarPunioFuego();

    /**
     * Ejecuta el ataque Ascuas.
     *
     * @return Mensaje indicando que el Pokémon está usando Ascuas.
     */
    public abstract String atacarAscuas();

    /**
     * Ejecuta el ataque Lanzallamas.
     *
     * @return Mensaje indicando que el Pokémon está usando Lanzallamas.
     */
    public abstract String atacarLanzallamas();
}