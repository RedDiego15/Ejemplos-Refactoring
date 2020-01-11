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
    private HashMap<String,Double> against = new HashMap<>();
    
    
    
    //private 

    public PokemonCorrect(String name, ArrayList<String> abilities, boolean isLegendary, double against_bug, double against_dark, double against_dragon, double against_electric, double against_fairy, double against_fight, double against_fire, double against_flying, double against_ghost, double against_grass, double against_ground, double against_ice, double against_normal, double against_poison, double against_psychic, double against_rock, double against_steel, double against_water, double attack, int capture_rate, int defense, int hp, String pokedex_number, String type1, String generation) {
        this.name = name;
        this.abilities = abilities;
        this.isLegendary = isLegendary;
        this.against_bug = against_bug;
        this.against_dark = against_dark;
        this.against_dragon = against_dragon;
        this.against_electric = against_electric;
        this.against_fairy = against_fairy;
        this.against_fight = against_fight;
        this.against_fire = against_fire;
        this.against_flying = against_flying;
        this.against_ghost = against_ghost;
        this.against_grass = against_grass;
        this.against_ground = against_ground;
        this.against_ice = against_ice;
        this.against_normal = against_normal;
        this.against_poison = against_poison;
        this.against_psychic = against_psychic;
        this.against_rock = against_rock;
        this.against_steel = against_steel;
        this.against_water = against_water;
        this.attack = attack;
        this.capture_rate = capture_rate;
        this.defense = defense;
        this.hp = hp;
        this.pokedex_number = pokedex_number;
        this.type1 = type1;
        this.generation = generation;
        
        against.put("bug",this.against_bug); against.put("dark",this.against_dark);
        against.put("dragon",this.against_dragon); against.put("electric",this.against_electric);
        against.put("fairy",this.against_fairy); against.put("fight",this.against_fight);
        against.put("fire",this.against_fire); against.put("flying",this.against_flying);
        against.put("ghost",this.against_ghost); against.put("grass",this.against_grass);
        against.put("ground",this.against_ground); against.put("ice",this.against_ice);
        against.put("normal",this.against_normal); against.put("poison",this.against_poison);
        against.put("psychic",this.against_psychic); against.put("rock",this.against_rock);
        against.put("steel",this.against_steel); against.put("water",this.against_water);
        
        
    }
}
