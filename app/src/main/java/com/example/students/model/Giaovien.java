package com.example.students.model;

public class Giaovien {
    private int MaGV;
    private String HoTen;
    private int GioiTinh;
    private String Email;
    private String Sodienthoai;
    private String Khoa;
    private String Bomon;

    public Giaovien() {
    }

    public Giaovien(int maGV, String hoTen, int gioiTinh, String email, String sodienthoai, String khoa, String bomon) {
        MaGV = maGV;
        HoTen = hoTen;
        GioiTinh = gioiTinh;
        Email = email;
        Sodienthoai = sodienthoai;
        Khoa = khoa;
        Bomon = bomon;
    }

    public Giaovien(String hoTen, int gioiTinh, String email, String sodienthoai, String khoa, String bomon) {
        HoTen = hoTen;
        GioiTinh = gioiTinh;
        Email = email;
        Sodienthoai = sodienthoai;
        Khoa = khoa;
        Bomon = bomon;
    }

    public int getMaGV() {
        return MaGV;
    }

    public void setMaGV(int maGV) {
        MaGV = maGV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        Sodienthoai = sodienthoai;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String khoa) {
        Khoa = khoa;
    }

    public String getBomon() {
        return Bomon;
    }

    public void setBomon(String bomon) {
        Bomon = bomon;
    }
}
