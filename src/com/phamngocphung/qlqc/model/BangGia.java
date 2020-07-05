/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phamngocphung.qlqc.model;

/**
 *
 * @author NGOC PHUNG
 */
public class BangGia {
    private String MaGIa;
    private int SoTienQC1Ngay;
    private String MaPhuongTienQC;
    private ChiTietHopDong chiTietHopDong;
    private PhuongTienQuangCao phuongTienQuangCao;
    private String MoTa;

    public String getMaGIa() {
        return MaGIa;
    }

    public void setMaGIa(String MaGIa) {
        this.MaGIa = MaGIa;
    }

    public int getSoTienQC1Ngay() {
        return SoTienQC1Ngay;
    }

    public void setSoTienQC1Ngay(int SoTienQC1Ngay) {
        this.SoTienQC1Ngay = SoTienQC1Ngay;
    }

    public String getMaPhuongTienQC() {
        return MaPhuongTienQC;
    }

    public void setMaPhuongTienQC(String MaPhuongTienQC) {
        this.MaPhuongTienQC = MaPhuongTienQC;
    }

    public ChiTietHopDong getChiTietHopDong() {
        return chiTietHopDong;
    }

    public void setChiTietHopDong(ChiTietHopDong chiTietHopDong) {
        this.chiTietHopDong = chiTietHopDong;
    }

    public PhuongTienQuangCao getPhuongTienQuangCao() {
        return phuongTienQuangCao;
    }

    public void setPhuongTienQuangCao(PhuongTienQuangCao phuongTienQuangCao) {
        this.phuongTienQuangCao = phuongTienQuangCao;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
    
    
}
