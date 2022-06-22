package com.mycompany.databarangu3;

public class Mahasiswa {
    
    private int nim;
    private String nama;
    private String jurusan;
    private String daerah;

    public int getNim() {
        return nim;
    }

    public void setKode(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setTipe(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getDaerah() {
        return daerah;
    }

    public void setDaerah(String daerah) {
        this.daerah = daerah;
    }
    
}
