package control;

import dao.RuanganDAO;
import model.Ruangan;

import java.util.List;

public class RuanganControl {
  public List<Ruangan> showListRuangan() {
    return new RuanganDAO().fetchAllRuangan();
  }
}
