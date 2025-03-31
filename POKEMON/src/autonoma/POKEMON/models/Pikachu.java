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

    public Pikachu(){
    }
    
    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y estoy atacando con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void atacarRayo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void atacarRayoCarga() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
