package GD12_D_11385_2;

public abstract class Observer {
  protected Perusahaan model;
  protected String namaPgw;
  protected float gaji;

  public Observer(Perusahaan model, float gaji, String namaPgw) {
    this.model = model;
    this.namaPgw = namaPgw;
    this.gaji = gaji;
    this.model.RegisterObserver(this);
  }

  public abstract void update(float bonus);
}
