/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech4_thread_sortenumero;

/**
 *
 * @author parrarodriguez.manue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Processo p1 = new Processo(5, 'A');
        Processo p2 = new Processo(6, 'B');
        Generatore T1 = new Generatore(p1);
        Generatore T2 = new Generatore(p2);
        T1.start();
        T2.start();
    }
    
}
