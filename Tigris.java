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
public class Tigris extends Allat{

    public Tigris() {
    }

    public Tigris(int kor) {
        super(kor);
    }

    
    
    @Override
    public void kiir() {
            System.out.println("Egy "+ kor +  " éves tigris");
    }

    @Override
    public void hangotAd() {
            System.out.println("GRRRRR");
    }
    
}
