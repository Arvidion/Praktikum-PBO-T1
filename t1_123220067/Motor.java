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
public class Motor extends Kendaraan{
    Motor(String nama){
        super(nama, 2);
    }
    public void maju(){
        System.out.println("Motor " + nama + " maju dengan gas");
    }
    public void rem(){
        System.out.println("Motor " + nama + " berhenti dengan rem");
    }
    public void pengemudi(){
        System.out.println("Motor " + nama + " dikemudikan pengendara\n");
    }
}
