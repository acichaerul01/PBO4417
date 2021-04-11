/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportasi;

/**
 *
 * @author Aci Chaerul Kafi
 */
public class Mobil {
    String warna;
    int tahun = 2021;
    
    public Mobil() {

    }
    
    public Mobil(String warna, int thn) {
        this.warna = warna;
        this.tahun = thn;
    }
    
    public String getwarna() {
        return warna;
    }
    public int gettahun() {
        return tahun;
    }
}
