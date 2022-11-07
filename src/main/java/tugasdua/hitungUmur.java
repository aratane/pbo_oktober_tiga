package tugasdua;

import java.util.Scanner;

public class hitungUmur {
    public static void main(String[] args) {
        waktu wkt = new waktu();
        wkt.umur();
    }
}

class waktu {
    int tahunL, bulanL, tanggalL, tahunW, bulanW, tanggalW, tahunU, bulanU, tanggalU;

    Scanner input = new Scanner(System.in);

    void umur() {
        System.out.println("PROGRAM HITUNG UMUR");
        System.out.println("===================");
        System.out.println("Waktu lahir => ");
        System.out.println("Tahun : ");
        tahunL = input.nextInt();
        System.out.println("Bulan : ");
        bulanL = input.nextInt();
        System.out.println("Tanggal : ");
        tanggalL = input.nextInt();

        System.out.println("===================");
        System.out.println("Waktu wafat => ");
        System.out.println("Tahun : ");
        tahunW = input.nextInt();
        System.out.println("Bulan : ");
        bulanW = input.nextInt();
        System.out.println("Tanggal : ");
        tanggalW = input.nextInt();

        tahunU = tahunW - tahunL;
        bulanU = bulanW - bulanL;
        tanggalU = tanggalW - tanggalL;

        if (tahunW < tahunL && bulanL > 12 && tanggalL > 31 && bulanL > bulanW && tanggalL > tanggalW) {
            System.out.println("ORANG INI TIDAK PERNAH HIDUP");
        } else {
            System.out.println("Orang ini hidup selama "+tahunU+" Tahun, "+bulanU+" Bulan, "+tanggalU+" Hari");
        }
    }
}


