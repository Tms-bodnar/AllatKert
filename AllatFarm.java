/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allatfarm;

/**
 *
 * @author bodnart
 */
public class AllatFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    Kutya kuty = new Kutya(2, "Blöki", 2);
    kuty.setCsontokSzama(3);
    Szamar csacsi = new Szamar("Gazsi", 3);
    csacsi.setIsMakacs(true);
    kuty.kiir();
    kuty.hangotAd();
    csacsi.kiir();
    csacsi.hangotAd();
    Tigris Shirkán = new Tigris(6);
    Shirkán.kiir();
    Shirkán.setKor(7);
    Shirkán.kiir();
    Shirkán.hangotAd();
    Allat[] allatok = new Allat[3];
    allatok[0] = kuty;
    allatok[1] = csacsi;
    allatok[2] = Shirkán;
    for(Allat allat : allatok){
        allat.kiir();
    }
    }
    
}
