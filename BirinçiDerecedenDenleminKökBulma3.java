import java.util.Scanner;

public class BirinçiDerecedenDenleminKökBulma3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        long a, b, c, x;
        System.out.println("İşlemler ax+b=c Denklemine göre");


        System.out.print("a nın kat sayısını giriniz: ");
        a = scr.nextLong();

        System.out.print("b nin kat sayısını giriniz: ");
        b= scr.nextLong();

        System.out.print("c nin kat sayısını giriniz:");
        c= scr.nextLong();
          x =(c-b)/a;

        System.out.println(" denklemin kökeni: %3l "+a);
        System.out.println(" denklemin kökeni: %3l "+b);
        System.out.println(" denklemin kökeni: %3l "+c);
        System.out.println(" denklemin kökeni: %3l " + x);


    }
}
