import java.util.Scanner;
public class Sayı_basamakları {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.print("sayıyı giriniz: ");
int sayıbasamak= scan.nextInt();
int basamaksayısı=0;
do {
sayıbasamak/=10;
basamaksayısı++;
}while (sayıbasamak>0);

        System.out.println("basamak sayısı:"+basamaksayısı);

    }
}
