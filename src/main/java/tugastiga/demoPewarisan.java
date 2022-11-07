package tugastiga;

public class demoPewarisan {
    public static void main(String[] args) {
        persegiPanjang pp = new persegiPanjang();
        balok blk = new balok();

        System.out.println("============START============");
        System.out.println("DATA PERSEGI PANJANG => ");
        pp.setPanjang();
        pp.setLebar();
        System.out.println("============END===========\n");


        System.out.println("============START===========");
        System.out.println("DATA BALOK => ");
        blk.setTinggi();
        System.out.println("=============END==========\n\n\n\n\n");

        System.out.println("==========PERSEGI PANJANG=============");
        System.out.println("DARI KELAS A");
        pp.total();
        System.out.println("============END===========\n");

        System.out.println("============BALOK============");
        System.out.println("DARI KELAS B");
        blk.total();
        System.out.println("============END============");
    }
}
