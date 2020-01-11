/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.DataClumps;

import codesmells.Address;

/**
 *
 * @author Lenovo comp
 */
public class Persona {
    
    private String nombre;
    private int edad;
    /*
    private String addres; /*podemos ver data clump ya que los atributos addres main Street y number house, aislados no tiene mucho sentido, pero
                            juntos si
    private String mainStreet;
    private int numberHouse;*/
    /*
    Solucion utilizar extract class para asi tener un solo objeto que tenga la informacion de la direccion de la persona
    */
    
    private Address address;
            
     public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    
}
