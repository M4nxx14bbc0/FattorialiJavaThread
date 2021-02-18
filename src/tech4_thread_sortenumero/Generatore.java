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
public class Generatore extends Thread {
    private Runnable r;

    public Generatore(Runnable r) {
        super(r);
        this.r = r;
    }

    @Override
    public void run() {
        super.run();
        r.run();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void start() {
        super.start();
        r.run();//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
