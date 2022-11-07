package latihanClass;

public class demoBalok1 {
    public static void main(String[] args) {
        double volume;

        balok bk = new balok();

        bk.panjang = 4;
        bk.lebar = 3;
        bk.tinggi = 2;

        volume = bk.panjang * bk.tinggi * bk.lebar;
        System.out.println("Volume Balok = "+volume);
    }
}
