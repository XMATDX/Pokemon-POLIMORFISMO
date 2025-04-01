/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.mian;

import autonoma.POKEMON.models.Charmander;
import autonoma.POKEMON.models.Pikachu;
import autonoma.POKEMON.models.Squirtle;

/**
 *
 * @author mateo
 */
public class main {
    
    public static void main(String[] args) {
    
        
    Charmander c = new Charmander();
    Pikachu p = new Pikachu();
    Squirtle s = new Squirtle();
    
    System.out.println(c.atacarLanzallamas());
    
    System.out.println(p.atacarRayo());
    
    System.out.println(s.atacarPistolaAgua());
    
    }

    
}
