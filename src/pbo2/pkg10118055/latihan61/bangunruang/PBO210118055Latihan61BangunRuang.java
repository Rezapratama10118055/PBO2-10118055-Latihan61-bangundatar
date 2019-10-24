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
public class PBO210118055Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lingkaran b = new bola();
        b.volume();
        System.out.println("===================");
        lingkaran t = new tabung();
        t.volume();
        System.out.println("===================");
        lingkaran k = new kerucut();
        k.volume();
    }
    
}
