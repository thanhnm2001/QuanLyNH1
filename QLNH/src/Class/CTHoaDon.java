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
public class CTHoaDon {
    String mama, tenmon;
    Float donGia, thanhTien;
    int soLuong;

    public CTHoaDon() {
    }

    public CTHoaDon(String mama, String tenmon, Float donGia, Float thanhTien, int soLuong) {
        this.mama = mama;
        this.tenmon = tenmon;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "CTHoaDon{" + "mama=" + mama + ", tenmon=" + tenmon + ", donGia=" + donGia + ", thanhTien=" + thanhTien + ", soLuong=" + soLuong + '}';
    }

    public String getMama() {
        return mama;
    }

    public void setMama(String mama) {
        this.mama = mama;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public Float getDonGia() {
        return donGia;
    }

    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }

    public Float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
