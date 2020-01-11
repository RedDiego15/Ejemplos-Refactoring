/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.FeaturedEnvy;

import codesmells.FeaturedEnvy.Address;

/**
 *
 * @author Lenovo comp
 */
public class Persona {
    
    private String nombre;
    private int edad;

    private Address address;
    /*
    Featured Envy el metodo verificar Direccion accede mas a los datos del objeto address
       
    public boolean VerificaDireccion(){
        if(address.getMainStreet().equals("6 de diciembre") && (address.getNumberHouse()==588)){
            return true;
        }
        return false;
    }
    */
    /*
    Solucion Move method
    */
    public boolean VerificaDireccion(){
        return address.VerificaDireccion();
    }
    
    
}
