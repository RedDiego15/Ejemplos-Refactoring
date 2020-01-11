/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.LargeClass;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Lenovo comp
 */
public class PokemonCorrect {
    private String name;
    private ArrayList<String> abilities;
    private boolean isLegendary;
    private Against against;
    private double attack;
    private int capture_rate;
    private int defense;
    private int hp;
    private String pokedex_number;
    private String type1;
    private String generation; // solo se debera considerar los pokemon de primera generacion
    /*
    
    */

    public PokemonCorrect(String name, ArrayList<String> abilities, boolean isLegendary,Against against, double attack, int capture_rate, int defense, int hp, String pokedex_number, String type1, String generation) {
        this.name = name;
        this.abilities = abilities;
        this.isLegendary = isLegendary;
        this.against = against;
        this.attack = attack;
        this.capture_rate = capture_rate;
        this.defense = defense;
        this.hp = hp;
        this.pokedex_number = pokedex_number;
        this.type1 = type1;
        this.generation = generation;
     
    }
}
