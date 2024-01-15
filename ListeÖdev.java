public class ListeÖdev {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9,10 };
        int toplama =0;
        for (int i=0;i< x.length;i++){
            toplama += x[i];
        }
        System.out.println(toplama);
    }
}
