/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.POKEMON.mian;

import autonoma.POKEMON.models.Charmander;
import autonoma.POKEMON.models.Pikachu;
import autonoma.POKEMON.models.Squirtle;

/**
 * Clase principal que ejecuta el programa y demuestra los ataques de los Pokémon.
 * Crea instancias de Charmander, Pikachu y Squirtle y muestra sus ataques en consola.
 *
 * @author Mateo Quintero <mateo.quinterom@autonoma.edu.com>
 * @version 1.0
 * @since 2025/03/31
 */
public class main {


    /**
     * Método principal que ejecuta el programa.
     * Crea instancias de los Pokémon Charmander, Pikachu y Squirtle,
     * y muestra sus ataques a través de la consola.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    
    public static void main(String[] args) {
    
    // Creación de los Pokémon    
    Charmander c = new Charmander();
    Pikachu p = new Pikachu();
    Squirtle s = new Squirtle();
    
    // Muestra los ataques de los Pokémon
    System.out.println(c.atacarLanzallamas());
    
    System.out.println(p.atacarRayo());
    
    System.out.println(s.atacarPistolaAgua());
    
    }

    
}
