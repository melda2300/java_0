public class Metodlar2 {
    public static void sayılar(){
        System.out.println("bölme "   + 20/10);
        System.out.println("carpma "  + 20*10);
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        sayılar();
    }

}

class deneme {
    public static void işlem(int a) {
        System.out.println("alınan yaş =" + a);
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {
işlem(25);
    }

}
class denem2{
    public static void toplam(int a,int b, int c){
        System.out.println("toplamları = "+(a+b+c));
    }
    public static void main(String[] args) {
     toplam(19,21,30);
    }

}
class deneme3 {
    public static int carpım(int a,int b, int c)
    {
        return(a*b*c); //neyi return etmek istediğimizi belirtiyoruz.
    }

    public static void main(String[] args) {
        System.out.println("çarpımları = "+ carpım(2,42,12)); //parametrelere değerler atadık.
    }
}
