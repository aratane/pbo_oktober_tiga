package tugasbesar;

import java.util.Scanner;

import static tugasbesar.hitungParkir.*;
import static tugasbesar.warna.*;

public class waktu {
    int jamM, menitM, detikM, jamK, menitK, detikK, jamL, menitL, detikL, lamaParkir, biaya, biayaMotor, biayaMobil;
    Scanner inputWaktu = new Scanner(System.in);

    void waktuMasuk() {
        System.out.println("Waktu Masuk => ");
        System.out.print("Jam : ");
        jamM = inputWaktu.nextInt();
        if (jamM > 24) {
            System.out.println("Silakan masukkan format jam yang benar !!");
        }
        System.out.print("Menit : ");
        menitM = inputWaktu.nextInt();
        if (menitM > 60) {
            System.out.println(ANSI_RED + "Silakan masukkan format menit yang benar !!");
        }
        System.out.print("Detik : ");
        detikM = inputWaktu.nextInt();
        if (detikM > 60) {
            System.out.println("Silakan masukkan format detik yang benar !!");
        }
    }

    void waktuKeluar() {
        System.out.println("Waktu Keluar => ");
        System.out.print("Jam : ");
        jamK = inputWaktu.nextInt();
        if (jamK < jamM) {
            System.out.println("Program ini hanya bekerja pada hari yang sama, Silakan input jam keluar dengan benar.");
            menu();
        } else if (jamK > 24) {
            System.out.println("Silakan masukkan format waktu yang benar !!");
        }
        System.out.print("Menit : ");
        menitK = inputWaktu.nextInt();
        System.out.print("Detik : ");
        detikK = inputWaktu.nextInt();
    }

    void bayarMotor() {
        biayaMotor = 1000;

        if (menitM > 60) {
            jamM++;
            menitM = menitM - 60;
        } else if (detikM > 60) {
            menitM++;
            detikM = detikM - 60;
        } else if (menitK > 60) {
            jamK++;
            menitK = menitK - 60;
        } else if (detikK > 60) {
            menitK++;
            detikK = detikK - 60;
        }
        jamL = jamK - jamM;
        menitL = menitK - menitM;
        if (menitM >= menitK) {
            menitK = menitM;
        } else if (detikM >= detikK) {
            detikK = detikM;
        }
        detikL = detikK - detikM;

        lamaParkir = jamL;
        biaya = biayaMotor * lamaParkir + 2000;
        notaBayar();
    }

    void bayarMobil() {
        biayaMobil = 2000;

        if (menitM >= 60) {
            jamM++;
            menitM = menitM - 60;
        } else if (detikM >= 60) {
            menitM++;
            detikM = detikM - 60;
        } else if (menitK >= 60) {
            jamK++;
            menitK = menitK - 60;
        } else if (detikK >= 60) {
            menitK++;
            detikK = detikK - 60;
        }
        jamL = jamK - jamM;
        menitL = menitK - menitM;
        detikL = detikK - detikM;

        lamaParkir = jamL;
        biaya = biayaMobil * lamaParkir + 3000;
        notaBayar();
    }

    void notaBayar() {
        System.out.println("PEMBAYARAN PARKIR");
        System.out.println("Jenis kendaraan : "+jnsKendaraan);
        System.out.println("Lama waktu parkir : "+jamL+ " Jam "+menitL+" Menit "+detikL+" Detik");
        System.out.println("Jumlah bayar parkir : "+biaya+" Rupiah");
    }
}
