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
    
    public Charmander(){
    }

    @Override
    public void atacarPunioFuego() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void atacarAscuas() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void atacarLanzallamas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
