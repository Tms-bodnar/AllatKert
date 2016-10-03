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
public class Szamar extends HaziAllat{    
    private boolean isMakacs;

    public Szamar() {
    }

    public Szamar( String nev, int kor) {
        super(nev, kor);
    }
       
    @Override
    public void kiir() {
        System.out.print(nev +" egy " + kor + "éves szamár, aki ");
        if(isMakacs){
            System.out.println("makacs.");
        }else{
            System.out.println("nem makacs.");
        }
    }

    @Override
    public void hangotAd() {
        System.out.println("ÍÍÁÁÁÁ");

    }

    public boolean isIsMakacs() {
        return isMakacs;
    }

    public void setIsMakacs(boolean isMakacs) {
        this.isMakacs = isMakacs;
    }
    
}
