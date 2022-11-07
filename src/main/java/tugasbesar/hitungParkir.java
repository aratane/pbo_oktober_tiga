package tugasbesar;

import java.util.Objects;
import java.util.Scanner;

import static tugasbesar.warna.*;

public class hitungParkir {
    static String jnsKendaraan;

    public static void main(String[] args) {
        menu();
    }
    static void menu() {
        Scanner input = new Scanner(System.in);
        waktu wkt = new waktu();

        System.out.println("JENIS KENDARAAN : ");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("PILIH JENIS KENDARAAN : ");
        jnsKendaraan = input.next();

        if (Objects.equals(jnsKendaraan, "Mobil")) {
            System.out.println("ANDA MEMILIH MOBIL");
            wkt.waktuMasuk();
            wkt.waktuKeluar();
            wkt.bayarMobil();
        } else if(Objects.equals(jnsKendaraan, "Motor")){
            System.out.println("ANDA MEMILIH MOTOR");
            wkt.waktuMasuk();
            wkt.waktuKeluar();
            wkt.bayarMotor();
        } else {
            System.out.println(ANSI_RED + "DATA YANG ANDA INPUT SALAH !!");
            clearScreen();
            menu();
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

class warna {
    public static final String ANSI_RED = "\u001B[31m";
}
