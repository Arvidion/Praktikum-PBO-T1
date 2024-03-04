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
public abstract class Kendaraan {
    protected String nama;
    protected int jumlahRoda;
    
    public Kendaraan(String nama, int jumlahRoda){
        this.nama = nama;
        this.jumlahRoda = jumlahRoda;
    }
    abstract void maju();
    abstract void rem();
    abstract void pengemudi();
    
    public void status(){
        System.out.println("Nama        : " + nama);
        System.out.println("Jumlah Roda : " + jumlahRoda);
    }
}
