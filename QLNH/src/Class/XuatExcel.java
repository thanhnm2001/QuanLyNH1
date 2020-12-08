/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Chung
 */
public class XuatExcel {
    String mahd, makh, manv, maban, mamon, tenmon, ngayLap;
    int soluong;
    float dongia, thanhTien, tong;

    public XuatExcel() {
    }

    public XuatExcel(String mahd, String makh, String manv, String maban, String mamon, String tenmon, String ngayLap, int soluong, float dongia, float thanhTien, float tong) {
        this.mahd = mahd;
        this.makh = makh;
        this.manv = manv;
        this.maban = maban;
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.ngayLap = ngayLap;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhTien = thanhTien;
        this.tong = tong;
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

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMaban() {
        return maban;
    }

    public void setMaban(String maban) {
        this.maban = maban;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public float getTong() {
        return tong;
    }

    public void setTong(float tong) {
        this.tong = tong;
    }

    @Override
    public String toString() {
        return "XuatExcel{" + "mahd=" + mahd + ", makh=" + makh + ", manv=" + manv + ", maban=" + maban + ", mamon=" + mamon + ", tenmon=" + tenmon + ", ngayLap=" + ngayLap + ", soluong=" + soluong + ", dongia=" + dongia + ", thanhTien=" + thanhTien + ", tong=" + tong + '}';
    }
    
}
