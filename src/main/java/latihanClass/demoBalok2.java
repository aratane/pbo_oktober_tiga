package latihanClass;

public class demoBalok2 {
    public static void main(String[] args) {
        double volume, volume2;
        balok bk, bk2;

        bk = new balok();
        bk2 = new balok();

        bk.panjang = 4;
        bk.lebar = 3;
        bk.tinggi = 2;

        bk2.panjang = 2;
        bk2.lebar = 4;
        bk2.tinggi = 5;

        volume = bk.panjang * bk.tinggi * bk.lebar;
        volume2 = bk2.panjang * bk2.tinggi * bk2.lebar;

        System.out.println("Volume balok 1 = "+volume);
        System.out.println("Volume balok 2 = "+volume2);
    }
}
