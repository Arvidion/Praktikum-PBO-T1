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
public class Kapal extends Kendaraan implements Berlayar{
    Kapal(String nama){
        super(nama, 0);
    }
    public void maju(){
        System.out.println("Kapal " + nama + " maju dengan menambah tenaga pada mesin");
    }
    public void rem(){
        System.out.println("Kapal " + nama + " berhenti dengan mengurangi tenaga pada mesin");
    }
    public void pengemudi(){
        System.out.println("Kapal " + nama + " dikemudikan nahkoda");
    }
    public void berlayar(){
        System.out.println("Kapal " + nama + " berlayar di lautan\n");
    }
}
