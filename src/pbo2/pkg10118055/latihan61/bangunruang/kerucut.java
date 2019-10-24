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
public class kerucut extends lingkaran{
   private int jari,tinggi;

    public int getJari() {
        jari =14;
        return jari;
    }

    public int getTinggi() {
        tinggi = 9;
        return tinggi;
        
    }
     public double hitungvolume(){
       double volume;
        tinggi = 9;
        jari =14;
        return volume= ((1)*(Math.PI)*jari*jari*tinggi)/3;
    }

    @Override
    public void volume() {
         System.out.println("======kerucut=======");
        System.out.println("Hasil :V = "+hitungvolume()+"cm");
        }
}
           

