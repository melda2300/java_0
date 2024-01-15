import java.util.Scanner;
public class üslüSayı {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Numarayı girin:");
        int numara = scr.nextInt();
        System.out.println("Üs numarasını girin:");
        int üstSayı= scr.nextInt();
        long sonuc=power(numara,üstSayı);
        System.out.println("İşlemin sonucu :"+sonuc);
    }

    public static long power(int numara ,int üstSayı){
        if (üstSayı==0){
            return 1;
        }else {
            return numara * power(numara,üstSayı-1);
        }
    }
}