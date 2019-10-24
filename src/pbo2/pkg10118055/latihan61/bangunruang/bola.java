/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan61.bangunruang;

/**
 *
 * @author User
 */
public class bola extends lingkaran{
 private double jari;

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    public double getJari() {
        jari = 7;
     double volume;
     
        return volume = ((4)*Math.PI*jari*jari*jari)/3;
    }
 
    @Override
    public void volume() {
        System.out.println("======bola=========");
        System.out.println("Hasil :V = "+getJari()+"cm");
        
    }

    
    
}
