
import java.util.Scanner;
public class BangunDatar {
private String Jenis;

    public void view(){
        System.out.print("Nama bangun datar adalah ");
    }
}
class Persegi extends BangunDatar{
    double sisi;
    public Persegi(double sisi){
        this.sisi=sisi;
    }
    public double luas(){
    double luas = sisi*sisi;
    return luas;
    }
    public double keliling(){
        double keliling = 4*sisi;
        return keliling;
    }
    public void view(){
    super.view();
        System.out.println("Persegi");
        System.out.println("Luasnya adalah "+luas()+" cm^2");
        System.out.println("Kelilingnya adalah "+keliling()+" cm");
    }
}
class Lingkaran extends BangunDatar{
    protected double jarijari;
    public Lingkaran(double jarijari){
        this.jarijari=jarijari;
    }
        public double luas(){
        double luas = Math.PI*jarijari*jarijari;
        return luas;
        }
        public double keliling(){
        double keliling = Math.PI*jarijari*2;
        return keliling;
        }
        public void view(){
            super.view();
            System.out.println("Lingkaran");
            System.out.println("luas lingkaran adalah "+luas());
            System.out.println("keliling lingkaran adalah "+keliling());
        }
}
class Segitiga extends BangunDatar{
    protected double alas, tinggi;
    public Segitiga(double alas){
        this.alas=alas;
    }
    public Segitiga(double alas, double tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
    }   
    public void view(){
        super.view();
        System.out.println("Segitiga");
    }
}
class SegitigaSamasisi extends Segitiga{
    protected double sisi = alas;  
    public SegitigaSamasisi(double sisi){
        super(sisi);
    }
      double luas(){
        double luas = 0.25*sisi*sisi*Math.sqrt(3);
        return luas;
    }
    double keliling(){
        double keliling = sisi+sisi+sisi;
        return keliling;
    }
    public void view(){
        super.view();
        System.out.println("Jenis Segitiga adalah Segitiga Sama Sisi");
        System.out.println("Luas segitiga adalah "+luas());
        System.out.println("Keliling segitiga adalah "+keliling());
    }
    
      }


class SegitigaSikuSiku extends Segitiga{
    public SegitigaSikuSiku(double alas, double tinggi){
        super(alas,tinggi);
    }
    public double SisiMiring(){
       return Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
}
   public double luas(){
       double luas = alas*tinggi*0.5;
       return luas;
   }
   public double keliling(){
       double keliling = alas+tinggi+SisiMiring();
       return keliling;
   }
   public void view(){
        super.view();
        System.out.println("Jenis Segitiga adalah Segitiga Siku Siku");
        System.out.println("Luas segitiga adalah "+luas());
        System.out.println("Keliling segitiga adalah "+keliling());
   }
}

