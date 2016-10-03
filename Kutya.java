/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allatfarm;

/**
 *
 * @author user
 */
public class Kutya extends HaziAllat{

    protected int csontokSzama;

    public Kutya() {
    }

    
    public Kutya(int csontokSzama, String nev, int kor) {
        super(nev, kor);
        this.csontokSzama = csontokSzama;
    }
    public int getCsontokSzama() {
        return csontokSzama;
    }
    public void setCsontokSzama(int csontokSzama) {
        this.csontokSzama = csontokSzama;
    }
    @Override
    public void kiir() {
        System.out.println(nev + " egy " + kor + " éves kutya, elásott csontjainak száma: " + csontokSzama);
    }

    @Override
    public void hangotAd() {
            System.out.println("Vau-Vau");

    }
    
}
