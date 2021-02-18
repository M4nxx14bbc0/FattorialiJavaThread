/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech4_thread_sortenumero;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author parrarodriguez.manue
 */
public class Processo implements Runnable{
    private char c = 'A';
    private boolean stoppable = true, operation;
    private int min;

    public Processo(int min, char c) {
        this.min = min;
        this.c = c;
        operation = true;
    }
    
    public synchronized void run(){
        int som = min;
        if (c == 'A') {
            while(!stoppable){
                System.out.println(som+" * "+(min-1)+"= "+(som*min));
                som = som * (min-1);
                min--;
                try{
                    Thread.sleep(500);
                } catch (InterruptedException interrupt) {
                    Logger.getLogger(Processo.class.getName()).log(Level.SEVERE, null, interrupt);
                }
                if (min == 1) {
                    ferma();
                }
            }
        } else {
            while(!stoppable){
                System.out.println("\t\t"+som+" * "+(min-1)+"= "+som);
                som = som * (min-1);
                min--;
                try{
                    Thread.sleep(500);
                } catch (InterruptedException interrupt) {
                    Logger.getLogger(Processo.class.getName()).log(Level.SEVERE, null, interrupt);
                }
                if (min == 1) {
                    ferma();
                }
            }
        }
        notify();
    }
    private static final Logger LOG = Logger.getLogger(Processo.class.getName());
    
    public void ferma(){
        stoppable = true;
    }
    
}
