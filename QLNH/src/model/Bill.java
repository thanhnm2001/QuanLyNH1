/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Bill {
    private String maHD;
    private String maKH;
    private String maNV;
    private String maBan;
    private float thanhTien;
    Date ngayLap;

    public Bill() {
    }

    public Bill(String maHD, String maKH, String maNV, String maBan, float thanhTien, Date ngayLap) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.maNV = maNV;
        this.maBan = maBan;
        this.thanhTien = thanhTien;
        this.ngayLap = ngayLap;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }
    
}
