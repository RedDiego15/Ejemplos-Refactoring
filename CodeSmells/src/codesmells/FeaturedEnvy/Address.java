/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.FeaturedEnvy;

/**
 *
 * @author Lenovo comp
 */
public class Address {
    private String addres; 
    private String mainStreet;
    private int numberHouse;
    
    
     public boolean VerificaDireccion(){
        return (mainStreet.equals("6 de diciembre") && (numberHouse==588));
    }
    
    
    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getMainStreet() {
        return mainStreet;
    }

    public void setMainStreet(String mainStreet) {
        this.mainStreet = mainStreet;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }
    
}
