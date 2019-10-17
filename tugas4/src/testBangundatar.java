import java.util.Scanner;
public class testBangundatar {
    public static void main(String[] args) {
        
        Scanner baca = new Scanner(System.in);
        System.out.println("Pilih bangun datar yang diinginkan\n1. Persegi\n2. Lingkaran\n3. Segitiga");                    
        System.out.print("Masukan pilihan Anda\t: ");
        int pilih = baca.nextInt();
        switch(pilih){
        case 1 : 
        {
            System.out.print("Masukkan panjang sisi\t: ");
            double sisi = baca.nextDouble();
            Persegi P = new Persegi(sisi);
            P.view();
            break;
        }
        case 2:
        {
            System.out.print("Masukan panjang jari-jari\t: ");
            double jarijari = baca.nextDouble();
            Lingkaran L = new Lingkaran(jarijari);
            L.view();
            break;
        }        
        case 3:
        {
            System.out.println("Pilih segitiga yg diinginkan\n1. Segitiga siku-siku\n2. Segitiga sama sisi");
            System.out.print("Masukan pilihan Anda\t: ");
            int pilihan = baca.nextInt();
            switch(pilihan){
                case 1 :
                {
                    System.out.print("Masukan panjang alas\t: ");
                    double alas = baca.nextDouble();
                    System.out.print("Masukan panjang tinggi\t: ");
                    double tinggi = baca.nextDouble();
                    SegitigaSikuSiku Sk = new SegitigaSikuSiku(alas, tinggi);
                    Sk.view();
                    break;
                }
                case 2:
                {
                    System.out.print("Masukkan panjang sisi\t: ");
                    double sisi = baca.nextDouble();
                    SegitigaSamasisi Sm = new SegitigaSamasisi(sisi);
                    Sm.view();
                    break;
                }
            }
            System.out.println("");
        }
    }
    
}
}
