package Table;

import Model.MataKuliah;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TableMataKuliah extends AbstractTableModel {
  private List<MataKuliah> list;

  public TableMataKuliah(List<MataKuliah> list) {
    this.list = list;
  }

  public int getRowCount() {
    return list.size();
  }

  public int getColumnCount() {
    return 5;
  }

  public Object getValueAt(int rowIndex, int columnIndex) {
    switch (columnIndex) {
      case 0:
        return list.get(rowIndex).getNama();
      case 1:
        return list.get(rowIndex).getDeskripsi();
      case 2:
        return list.get(rowIndex).getDosen().getNama();
      case 3:
        return list.get(rowIndex).getMetodePembelajaran();
      case 4:
        return list.get(rowIndex).getKelas();
      case 5:
        return list.get(rowIndex).getId();
      case 6:
        return list.get(rowIndex).getDosen().getNomorIndukDosen();
      default:
        return null;
    }
  }

  public String getColumnName(int column) {
    switch (column) {
      case 0:
        return "Nama Mata Kuliah";
      case 1:
        return "Deskripsi";
      case 2:
        return "Dosen";
      case 3:
        return "Metode Pembelajaran";
      case 4:
        return "Kelas";
      default:
        return null;
    }
  }
}
