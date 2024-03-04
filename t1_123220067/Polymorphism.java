/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_123220067;

/**
 *
 * @author LENOVO
 */
public class Polymorphism {
    public static void main(String[] args){
        Mobil mobil = new Mobil("Toyota Starlet");
        mobil.status();
        mobil.maju();
        mobil.rem();
        mobil.pengemudi();
        
        Motor motor = new Motor("Honda Beat");
        motor.status();
        motor.maju();
        motor.rem();
        motor.pengemudi();
        
        Kapal kapal = new Kapal("Going Merry");
        kapal.status();
        kapal.maju();
        kapal.rem();
        kapal.pengemudi();
        kapal.berlayar();
    }
}
