/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 * Representa un Bulbasaur, una subclase de Pokemon que implementa la interfaz 
 * PokemonPlanta, lo que le permite ejecutar ataques de tipo planta específicos.
 *
 * @author Mateo Quintero <mateo.quinterom@autonoma.edu.co>
 * @version 1.0
 * @since 2025/04/01
 */
public class Bulbasaur extends Pokemon implements PokemonPlanta {

    /**
     * Realiza el ataque Paralizar.
     *
     * @return Mensaje indicando que Bulbasaur está usando Paralizar.
     */
    @Override
    public String atacarParalizar() {
        return "Soy Bulbasaur y estoy atacando con Paralizar";
    }

    /**
     * Realiza el ataque Drenaje.
     *
     * @return Mensaje indicando que Bulbasaur está usando Drenaje.
     */
    @Override
    public String atacarDrenaje() {
        return "Soy Bulbasaur y estoy atacando con Drenaje";
    }

    /**
     * Realiza el ataque Hoja Afilada.
     *
     * @return Mensaje indicando que Bulbasaur está usando Hoja Afilada.
     */
    @Override
    public String atacarHojaAfilada() {
        return "Soy Bulbasaur y estoy atacando con Hoja Afilada";
    }

    /**
     * Realiza el ataque Látigo Cepa.
     *
     * @return Mensaje indicando que Bulbasaur está usando Látigo Cepa.
     */
    @Override
    public String atacarLatigoCepa() {
        return "Soy Bulbasaur y estoy atacando con Látigo Cepa";
    }
}
