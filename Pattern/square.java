package Pattern;

public class square {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        int z = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(z);
            }
            z = z - 1;
            System.out.println();
        }

    }
}
