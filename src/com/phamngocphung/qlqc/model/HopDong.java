/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phamngocphung.qlqc.model;

import java.util.Date;

/**
 *
 * @author NGOC PHUNG
 */
public class HopDong {
    private int SoHopDong;
    private Date NgayLapHopDong;
    private String MaKhach;
    private int ThangTien;

    public int getSoHopDong() {
        return SoHopDong;
    }

    public void setSoHopDong(int SoHopDong) {
        this.SoHopDong = SoHopDong;
    }

    public Date getNgayLapHopDong() {
        return NgayLapHopDong;
    }

    public void setNgayLapHopDong(Date NgayLapHopDong) {
        this.NgayLapHopDong = NgayLapHopDong;
    }

    public String getMaKhach() {
        return MaKhach;
    }

    public void setMaKhach(String MaKhach) {
        this.MaKhach = MaKhach;
    }

    public int getThangTien() {
        return ThangTien;
    }

    public void setThangTien(int ThangTien) {
        this.ThangTien = ThangTien;
    }
    
    
            
    
}
