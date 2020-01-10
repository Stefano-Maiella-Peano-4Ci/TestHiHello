/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciaohihello;

/**
 *
 * @author maiella.stefano
 */
public class Say extends Thread{
    
    /*Inizializzazione della stringa che verra stampata*/
    
    String cosaDire;
    
    /*Costruttore della classe Say*/
    
    public Say(String cosaDire) {
        this.cosaDire=cosaDire;
    }
    
    /*Compilazione del metodo run che verra eseguido in parallelo con gli alrti threads*/
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(cosaDire);       
        }
    }
}
