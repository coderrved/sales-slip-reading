/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

public class Urunler {
    
    private int id;
    private String isletmeAdi;
    private String tarih;
    private String fisNo;
    private String urunler;
    private String saat;
    private String kdv;
    private String toplam;

    public Urunler(int id, String isletmeAdi, String tarih, String fisNo, String urunler, String saat, String kdv, String toplam) {
        this.id = id;
        this.isletmeAdi = isletmeAdi;
        this.tarih = tarih;
        this.fisNo = fisNo;
        this.urunler = urunler;
        this.saat = saat;
        this.kdv = kdv;
        this.toplam = toplam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsletmeAdi() {
        return isletmeAdi;
    }

    public void setIsletmeAdi(String isletmeAdi) {
        this.isletmeAdi = isletmeAdi;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getFisNo() {
        return fisNo;
    }

    public void setFisNo(String fisNo) {
        this.fisNo = fisNo;
    }

    public String getUrunler() {
        return urunler;
    }

    public void setUrunler(String urunler) {
        this.urunler = urunler;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getKdv() {
        return kdv;
    }

    public void setKdv(String kdv) {
        this.kdv = kdv;
    }

    public String getToplam() {
        return toplam;
    }

    public void setToplam(String toplam) {
        this.toplam = toplam;
    }
    
    
}