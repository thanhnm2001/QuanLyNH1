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
public class Ban {
    private String maBan;
    private String tenBan;
    private String trangThai;
    private String loaiBan;

    public Ban() {
    }

    public Ban(String maBan, String tenBan, String trangThai, String loaiBan) {
        this.maBan = maBan;
        this.tenBan = tenBan;
        this.trangThai = trangThai;
        this.loaiBan = loaiBan;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getLoaiBan() {
        return loaiBan;
    }

    public void setLoaiBan(String loaiBan) {
        this.loaiBan = loaiBan;
    }
    
}
