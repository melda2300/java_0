public class İkiBoyutluDiziler {
    public static void main(String[] args) {
        int[][] sayılar = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] sayı : sayılar) {
            for (int num : sayı) {
              //  System.out.print(num+",");
            }
            System.out.print(sayılar.length);
        }
    }
}
