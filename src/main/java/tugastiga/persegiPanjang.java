package tugastiga;

import java.util.Scanner;

public class persegiPanjang {
    int panjang, lebar, getPanjang, getLebar, tinggi;
    double luas;
    Scanner inputPP = new Scanner(System.in);

    void setPanjang() {
        System.out.println("Panjang : ");
        panjang = inputPP.nextInt();
    }

    void setLebar() {
        balok blk1 = new balok();
        blk1.getTinggi = tinggi;

        System.out.println("Lebar : ");
        lebar = inputPP.nextInt();
        System.out.println("Tinggi : ");
        tinggi = inputPP.nextInt();

        luas = (2 * panjang * lebar) + (2 * lebar * tinggi) + (2 * panjang * tinggi);
    }

    void total() {
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar : "+lebar);
        System.out.println("Tinggi : "+tinggi);
        System.out.println("Luas : "+luas);
    }
}

class itclub {
}
