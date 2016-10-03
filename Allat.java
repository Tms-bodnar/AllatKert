/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allatfarm;

/**
 *
 * @author bodnar
 */
public abstract class Allat {
    protected int kor;

    public Allat() {
    }

    public Allat(int kor) {
        this.kor = kor;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public abstract void kiir();
    public abstract void hangotAd();
}
