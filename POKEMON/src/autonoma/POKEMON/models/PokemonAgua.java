/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 * Interfaz que define los ataques de tipo Agua que pueden ejecutar ciertos Pokémon.
 * Cualquier clase que implemente esta interfaz debe proporcionar la implementación
 * de los métodos de ataque de agua.
 *
 * @author Maribel Ceballos <maribel.ceballosc@gmail.com>
 * @version 1.0
 * @since 2025/04/01
 */
public interface PokemonAgua {

    /**
     * Ejecuta el ataque Hidrobomba.
     *
     * @return Mensaje indicando que el Pokémon está usando Hidrobomba.
     */
    public abstract String atacarHidrobomba();

    /**
     * Ejecuta el ataque Pistola Agua.
     *
     * @return Mensaje indicando que el Pokémon está usando Pistola Agua.
     */
    public abstract String atacarPistolaAgua();

    /**
     * Ejecuta el ataque Burbuja.
     *
     * @return Mensaje indicando que el Pokémon está usando Burbuja.
     */
    public abstract String atacarBurbuja();

    /**
     * Ejecuta el ataque Hidropulso.
     *
     * @return Mensaje indicando que el Pokémon está usando Hidropulso.
     */
    public abstract String atacarHidropulso();
}