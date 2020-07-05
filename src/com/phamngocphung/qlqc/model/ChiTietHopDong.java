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
public class ChiTietHopDong {
    private int SoHopDong;
    private String MaGia;
    private Date NgayBatDauQC;
    private Date NgayKetThucQC;

    public int getSoHopDong() {
        return SoHopDong;
    }

    public void setSoHopDong(int SoHopDong) {
        this.SoHopDong = SoHopDong;
    }

    public String getMaGia() {
        return MaGia;
    }

    public void setMaGia(String MaGia) {
        this.MaGia = MaGia;
    }

    public Date getNgayBatDauQC() {
        return NgayBatDauQC;
    }

    public void setNgayBatDauQC(Date NgayBatDauQC) {
        this.NgayBatDauQC = NgayBatDauQC;
    }

    public Date getNgayKetThucQC() {
        return NgayKetThucQC;
    }

    public void setNgayKetThucQC(Date NgayKetThucQC) {
        this.NgayKetThucQC = NgayKetThucQC;
    }
    
    
    
}
