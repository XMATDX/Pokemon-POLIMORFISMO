/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 * Interfaz que define los ataques de tipo Planta que pueden ejecutar ciertos Pokémon.
 * Cualquier clase que implemente esta interfaz debe proporcionar la implementación
 * de los métodos de ataque de planta.
 *
 * @author Maribel Ceballos <maribel.ceballosc@autonoma.edu.com>
 * @version 1.0
 * @since 2025/04/01
 */
public interface PokemonPlanta {

    /**
     * Ejecuta el ataque Paralizar.
     *
     * @return Mensaje indicando que el Pokémon está usando Paralizar.
     */
    public abstract String atacarParalizar();

    /**
     * Ejecuta el ataque Drenaje.
     *
     * @return Mensaje indicando que el Pokémon está usando Drenaje.
     */
    public abstract String atacarDrenaje();

    /**
     * Ejecuta el ataque Hoja Afilada.
     *
     * @return Mensaje indicando que el Pokémon está usando Hoja Afilada.
     */
    public abstract String atacarHojaAfilada();

    /**
     * Ejecuta el ataque Látigo Cepa.
     *
     * @return Mensaje indicando que el Pokémon está usando Látigo Cepa.
     */
    public abstract String atacarLatigoCepa();
}