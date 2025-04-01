/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.models;

/**
 *
 * @author maribel ceballos <maribel.ceballosc@autonoma.edu.co>
 * @version 0.1
 * @since   2025/03/31
 */
public class Pikachu extends Pokemon implements PokemonElectrico{
    
    public Pikachu(int numPOkedex, String nombre, double peso, int temporada) {
        super(numPOkedex, nombre, peso, temporada);
    }

    public Pikachu(){
    }
    
    @Override
    public String atacarImpactrueno() {
        return ("Soy Pikachu y estoy atacando con Impactrueno");
    }
    
    @Override
    public String atacarPunioTrueno() {
      return ("Soy Pikachu y estoy atacando con Puniotrueno");
    }

    @Override
    public String atacarRayo() {
        return ("Soy Pikachu y estoy atacando con Rayo");
    }

    @Override
    public String atacarRayoCarga() {
        return ("Soy Pikachu y estoy atacando con RayoCarga"); 
    }
    
}

