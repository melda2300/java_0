public class Metotlar {
    public static String ikisayıyıkarsılastır(int i, int l) {
        if (i > l) {
            return "i büyüktür";
        } else {
            return "l büyüktür";
        }
    }

    public static void main(String[] args) {


        int i = 5;
        int l = 10;
        String sonuc = ikisayıyıkarsılastır(23, 20);
        int sonuc1 = l + i;
        System.out.println(sonuc);
    }
}
