/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 *
 * @author mateo
 */
public class Pikachu extends Pokemon implements PokemonElectrico{
    
    public Pikachu(int numPOkedex, String nombre, double peso, int temporada) {
        super(numPOkedex, nombre, peso, temporada);
    }

    @Override
    public String atacarImpactrueno() {
        return ("Soy Pikachu y estoy atacando con Impactrueno");
    }

    @Override
    public String atacarPunioTrueno() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String atacarRayo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String atacarRayoCarga() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
