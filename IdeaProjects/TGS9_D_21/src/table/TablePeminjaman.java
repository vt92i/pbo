/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.PeminjamanRuangan;
/**
 *
 * @author Lenovo
 */
public class TablePeminjaman extends AbstractTableModel{
    List<PeminjamanRuangan> list;
    
    public TablePeminjaman(List<PeminjamanRuangan> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 8;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getKaryawan().getNama();
            case 1:
                return list.get(rowIndex).getKaryawan().getJenis();
            case 2:
                return list.get(rowIndex).getRuangan().getNama();
            case 3:
                return list.get(rowIndex).getTanggal();
            case 4:
                return list.get(rowIndex).getLamaPeminjaman();
            case 5:
                return list.get(rowIndex).getFasilitas();
            case 6:
                return list.get(rowIndex).getKaryawan().getBebanMengajar();
            case 7:
                return list.get(rowIndex).getKaryawan().getJamKerja();
            default:
                return null;
        }
    }
    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0:
                return "Nama Karyawan";
            case 1:
                return "Jenis Karyawan";
            case 2:
                return "Nama Ruangan";
            case 3:
                return "Tanggal";
            case 4:
                return "Lama Pinjam";
            case 5:
                return "Fasilitas";
            case 6:
                return "Beban Mengajar";
            case 7:
                return "Jam Kerja";
            default:
                return null;
        }
    }
    
}
