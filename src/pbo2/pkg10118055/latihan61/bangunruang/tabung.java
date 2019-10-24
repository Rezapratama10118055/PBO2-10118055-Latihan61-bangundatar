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
public class tabung extends lingkaran{
private int jari,tinggi;
 private double  phi =3.14;

    public int getJari() {
        jari = 10;
        return jari;
    }

    public int getTinggi() {
        tinggi = 21;
        return tinggi;
    }
    public double hitungvolume(){
        
        return phi*getJari()*getJari()*getTinggi();
    }
    
    
    @Override
    public void volume() {
         System.out.println("======Tabung=======");
        System.out.println("Hasil :V = "+hitungvolume()+"cm");
        
    }
    
    
}
