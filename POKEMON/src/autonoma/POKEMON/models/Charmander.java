/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 *
 * @author mateo
 */
public class Charmander extends Pokemon implements PokemonFuego {

    public Charmander(int numPOkedex, String nombre, double peso, int temporada) {
        super(numPOkedex, nombre, peso, temporada);
    }

    @Override
    public String atacarPunioFuego() {
        return ("Soy Chanrmander y estoy atacando con PunioFuego");
    }

    @Override
    public String atacarAscuas() {
        return ("Soy Chanrmander y estoy atacando con Ascuas");
    }

    @Override
    public String atacarLanzallamas() {
        return ("Soy Chanrmander y estoy atacando con LanzaLlamas");
    }
    
}
