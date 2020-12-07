/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrator
 */
public class DetailBill {
    private String maHD;
    private String maMA;
    private int SL;

    public DetailBill() {
    }

    public DetailBill(String maHD, String maMA, int SL) {
        this.maHD = maHD;
        this.maMA = maMA;
        this.SL = SL;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaMA() {
        return maMA;
    }

    public void setMaMA(String maMA) {
        this.maMA = maMA;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }
    
}
