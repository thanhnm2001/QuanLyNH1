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
public class ThongTinMon {
    String maMa;
     String tenmon;
     float dongia;
     String anh;

    public ThongTinMon() {
    }

    public ThongTinMon(String maMa, String tenmon, float dongia, String anh) {
        this.maMa = maMa;
        this.tenmon = tenmon;
        this.dongia = dongia;
        this.anh = anh;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    @Override
    public String toString() {
        return "ThongTinMon{" + "maMa=" + maMa + ", tenmon=" + tenmon + ", dongia=" + dongia + ", anh=" + anh + '}';
    }

    

    

    public String getMaMa() {
        return maMa;
    }

    public void setMaMa(String maMa) {
        this.maMa = maMa;
    }

  
    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }
    
}
