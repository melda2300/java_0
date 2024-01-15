public class sayılar {
    static void sayılar1(int[] liste) {
        int n = liste.length, m = 0;
        for (int a = 0; a < n; a++) {
            for (int j = 1; j < (n - a); j++) {
                if (liste[j - 1] > liste[j]) {
                    m = liste[j];
                    liste[j - 1] = liste[j];
                    liste[j] = m;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,12,414,5};
        System.out.println("sıralamada önceki dize : ");
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x]+" , ");
        }
        System.out.println();
        sayılar1(arr);
        System.out.println("sıralamada sonra ki dize : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
    }
}
