/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.PrimitiveObsession;

import javafx.scene.paint.Color;

/**
 *
 * @author Lenovo comp
 */
public class PrimitiveObession {
    
    protected int rojo;
    protected int verde;
    protected int azul;
    /*
    Aqui podemos ver primitive Obsession ya que se intenta crear un color 
    atravez de las variables primitivas rojo verde y azul
    */
    /*
    Solucion Replace data value with Object utilizar una clase dada por java que 
    maneje elcolor
    */
    protected Color color;
    public void inicia(){
        //rojo,ver,azul = 255;
        color = Color.rgb(255, 255, 255);
    }

}
