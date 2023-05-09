import Control.DosenControl;
import DAO.MataKuliahDAO;
import Model.MataKuliah;

public class Main {
  public static void main(String[] args) {
    DosenControl dosenControl = new DosenControl();

//    for (int i = 1; i != 10; i++)
//      dosenControl.insertDataDosen(new Dosen("D" + i, "Dosen " + i, "dosen" + i + "@gmail.com", "08123456789"));

    System.out.println(dosenControl.showAllDataDosen());
//    for (Dosen d : new DosenDAO().fetchAllDosen()) {
//      for (int i = 1; i <= 5; i++)
//        new MataKuliahDAO().insertMataKuliah(new MataKuliah("MK" + i, "Mata Kuliah " + i, "Online", "Online", d));
//    }

    for (MataKuliah mk : new MataKuliahDAO().fetchMataKuliah("Online")) {
//      if (mk.getId() > 3) break;
//      mk.setMetodePembelajaran("Offline");
//      mk.setKelas("3421");
//      new MataKuliahDAO().updateMataKuliah(mk);
      System.out.println(mk.getMetodePembelajaran());
//      new MataKuliahDAO().deleteMataKuliah(mk.getId());
    }
  }
}
