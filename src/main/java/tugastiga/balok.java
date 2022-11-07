package tugastiga;

import java.util.Scanner;
public class balok {
    int tinggi, getTinggi, panjang, lebar;
    double volume;
    Scanner inputBalok = new Scanner(System.in);

    void setTinggi() {
        persegiPanjang pp = new persegiPanjang();
        pp.getPanjang = panjang;
        pp.getLebar = lebar;

        System.out.println("Panjang : ");
        panjang = inputBalok.nextInt();
        System.out.println("Lebar : ");
        lebar = inputBalok.nextInt();
        System.out.println("Tinggi : ");
        tinggi = inputBalok.nextInt();

        volume = panjang * tinggi * lebar;
    }

    void total() {
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar : "+lebar);
        System.out.println("Tinggi : "+tinggi);
        System.out.println("Volume : "+volume);
    }
}
