/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Date;

/**
 *
 * @author Chung
 */
public class HoaDon {
    String mahd, makh, maban, manv,  ngayLap;

    public HoaDon() {
    }

    public HoaDon(String mahd, String makh, String maban, String manv, String ngayLap) {
        this.mahd = mahd;
        this.makh = makh;
        this.maban = maban;
        this.manv = manv;
        this.ngayLap = ngayLap;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "mahd=" + mahd + ", makh=" + makh + ", maban=" + maban + ", manv=" + manv + ", ngayLap=" + ngayLap + '}';
    }

    
    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getMaban() {
        return maban;
    }

    public void setMaban(String maban) {
        this.maban = maban;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    
}
