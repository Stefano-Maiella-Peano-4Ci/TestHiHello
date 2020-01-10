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
public class CiaoHiHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Creazione dei 3 oggetti utili*/
        
        Say say1 = new Say("Hi");
        Say say2 = new Say("Hello");
        Say say3 = new Say("Ciao");
        
        /*Inizio dei Thred*/
        
        say1.start();
        say2.start();
        say3.start();
        
        /*Col metodo say1.join() il SO aspetta che i Thread concludano il loro codice
          per passare il controllo della CPU adgli altri threads */
        
//        say1.join();
//        say2.join();
//        say3.join();
    }
    
}
