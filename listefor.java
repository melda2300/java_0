public class listefor {
    public static int[] ekleme(int[] x, int y) {
        int[] ekle = new int[x.length + 1];
        for (int i = 0; i < x.length; i++) {
            ekle[i] = x[i];
        }
        ekle[ekle.length - 1] = y;
        return ekle;
    }

    public static void main(String[] args) {
        int[] eklenece = {1, 2, 3, 4, 5};
        int[] ekle = ekleme(eklenece, 100);
        {
            for (int j : ekle)
                System.out.print(j + ",");
        }
    }
}