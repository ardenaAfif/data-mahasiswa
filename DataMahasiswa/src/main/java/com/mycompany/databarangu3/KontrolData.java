package com.mycompany.databarangu3;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;

public class KontrolData  {
    
    private final String[] header = {"NIM", "Nama Mahasiswa", "Jurusan", "Daerah"};
    private final ArrayList<Mahasiswa> list = new ArrayList<>();
    
    public void tampil(JTable jt) {
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        
        for (int i = 0; i < list.size(); i++) {
            Object[] ob = new Object[4];
            ob[0] = list.get(i).getNim();
            ob[1] = list.get(i).getNama();
            ob[2] = list.get(i).getJurusan();
            ob[3] = list.get(i).getDaerah();
            dtm.addRow(ob);
        }
        jt.setModel(dtm);
    }
    
    public void tambah(Mahasiswa mhs) {
        list.add(mhs);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void ganti(Mahasiswa mhs) {
        for (int i = 0; i < list.size(); i++) {
            if (mhs.getNim() == list.get(i).getNim()) {
                list.set(i, mhs);
            }
        }
        JOptionPane.showMessageDialog(null, "Data Mahasiswa Berhasil Diubah");
    }

    public void hapus(int kode) {
        for (int i = 0; i < list.size(); i++) {
            if (kode == list.get(i).getNim()) {
                list.remove(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Data Mahasiswa Berhasil Dihapus");
    }   
    
}
