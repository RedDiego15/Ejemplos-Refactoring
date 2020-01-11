/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.LargeClass;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author LenovoComp
 * Long class
 * Solucion Extract 
 */
public class Pokemon implements Serializable{
    private String name;
    private ArrayList<String> abilities;
    private boolean isLegendary;
    private double against_bug;
    private double against_dark;
    private double against_dragon;
    private double against_electric;
    private double against_fairy;
    private double against_fight;
    private double against_fire;
    private double against_flying;
    private double against_ghost;
    private double against_grass;
    private double against_ground;
    private double against_ice;
    private double against_normal;
    private double against_poison;
    private double against_psychic;
    private double against_rock;
    private double against_steel;
    private double against_water;
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

    public Pokemon(String name, ArrayList<String> abilities, boolean isLegendary, double against_bug, double against_dark, double against_dragon, double against_electric, double against_fairy, double against_fight, double against_fire, double against_flying, double against_ghost, double against_grass, double against_ground, double against_ice, double against_normal, double against_poison, double against_psychic, double against_rock, double against_steel, double against_water, double attack, int capture_rate, int defense, int hp, String pokedex_number, String type1, String generation) {
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    
    
    public HashMap<String, Double> getAgainst() {
        return against;
    }

    public void setAgainst(HashMap<String, Double> against) {
        this.against = against;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
    }

    public boolean isIsLegendary() {
        return isLegendary;
    }

    public void setIsLegendary(boolean isLegendary) {
        this.isLegendary = isLegendary;
    }

    public double getAgainst_bug() {
        return against_bug;
    }

    public void setAgainst_bug(double against_bug) {
        this.against_bug = against_bug;
    }

    public double getAgainst_dark() {
        return against_dark;
    }

    public void setAgainst_dark(double against_dark) {
        this.against_dark = against_dark;
    }

    public double getAgainst_dragon() {
        return against_dragon;
    }

    public void setAgainst_dragon(double against_dragon) {
        this.against_dragon = against_dragon;
    }

    public double getAgainst_electric() {
        return against_electric;
    }

    public void setAgainst_electric(double against_electric) {
        this.against_electric = against_electric;
    }

    public double getAgainst_fairy() {
        return against_fairy;
    }

    public void setAgainst_fairy(double against_fairy) {
        this.against_fairy = against_fairy;
    }

    public double getAgainst_fight() {
        return against_fight;
    }

    public void setAgainst_fight(double against_fight) {
        this.against_fight = against_fight;
    }

    public double getAgainst_fire() {
        return against_fire;
    }

    public void setAgainst_fire(double against_fire) {
        this.against_fire = against_fire;
    }

    public double getAgainst_flying() {
        return against_flying;
    }

    public void setAgainst_flying(double against_flying) {
        this.against_flying = against_flying;
    }

    public double getAgainst_ghost() {
        return against_ghost;
    }

    public void setAgainst_ghost(double against_ghost) {
        this.against_ghost = against_ghost;
    }

    public double getAgainst_grass() {
        return against_grass;
    }

    public void setAgainst_grass(double against_grass) {
        this.against_grass = against_grass;
    }

    public double getAgainst_ground() {
        return against_ground;
    }

    public void setAgainst_ground(double against_ground) {
        this.against_ground = against_ground;
    }

    public double getAgainst_ice() {
        return against_ice;
    }

    public void setAgainst_ice(double against_ice) {
        this.against_ice = against_ice;
    }

    public double getAgainst_normal() {
        return against_normal;
    }

    public void setAgainst_normal(double against_normal) {
        this.against_normal = against_normal;
    }

    public double getAgainst_poison() {
        return against_poison;
    }

    public void setAgainst_poison(double against_poison) {
        this.against_poison = against_poison;
    }

    public double getAgainst_psychic() {
        return against_psychic;
    }

    public void setAgainst_psychic(double against_psychic) {
        this.against_psychic = against_psychic;
    }

    public double getAgainst_rock() {
        return against_rock;
    }

    public void setAgainst_rock(double against_rock) {
        this.against_rock = against_rock;
    }

    public double getAgainst_steel() {
        return against_steel;
    }

    public void setAgainst_steel(double against_steel) {
        this.against_steel = against_steel;
    }

    public double getAgainst_water() {
        return against_water;
    }

    public void setAgainst_water(double against_water) {
        this.against_water = against_water;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public int getCapture_rate() {
        return capture_rate;
    }

    public void setCapture_rate(int capture_rate) {
        this.capture_rate = capture_rate;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getPokedex_number() {
        return pokedex_number;
    }

    public void setPokedex_number(String pokedex_number) {
        this.pokedex_number = pokedex_number;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }
    
    
    
    
}
