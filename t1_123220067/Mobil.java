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
public class Mobil extends Kendaraan{
    Mobil(String nama){
        super(nama, 4);
    }
    public void maju(){
        System.out.println("Mobil " + nama + " maju dengan gas");
    }
    public void rem(){
        System.out.println("Mobil " + nama + " berhenti dengan rem");
    }
    public void pengemudi(){
        System.out.println("Mobil " + nama + " dikemudikan supir\n");
    }
}
