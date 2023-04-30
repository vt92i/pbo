public class PersegiPanjang {
    private double panjang, lebar;

    public PersegiPanjang() {
        this.panjang = 14.8;
        this.lebar = 7.4;
    }

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double luas() {
        return this.panjang * this.lebar;
    }

    public double keliling() {
        return 2 * (this.panjang + this.lebar);
    }

    public void print() {
        System.out.println("Panjang : " + this.panjang);
        System.out.println("Lebar : " + this.lebar);
        System.out.println("Keliling : " + this.keliling());
        System.out.println("Luas : " + this.luas());
    }
}
