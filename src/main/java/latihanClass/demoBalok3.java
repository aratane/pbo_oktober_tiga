package latihanClass;

public class demoBalok3 {
    public static void main(String[] args) {
        double volume, volume2, volume3, luas, luas2, luas3;
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
        volume3 = volume2;

        System.out.println("=========================");
        System.out.println("Volume balok 1 = "+volume);
        System.out.println("Volume balok 2 = "+volume2);
        System.out.println("Volume balok 3 = "+volume3);

        // Mencari Luas
        luas = (2 * bk.panjang * bk.lebar) + (2 * bk.lebar * bk.tinggi) + (2 * bk.panjang * bk.tinggi);
        luas2 = (2 * bk2.panjang * bk2.lebar) + (2 * bk2.lebar * bk2.tinggi) + (2 * bk2.panjang * bk2.tinggi);
        luas3 = luas2;

        System.out.println("=========================");
        System.out.println("Luas balok 1 = "+luas);
        System.out.println("Luas balok 2 = "+luas2);
        System.out.println("Luas balok 3 = "+luas3);
    }
}
