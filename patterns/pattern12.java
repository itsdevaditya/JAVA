public class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i - j + 1);
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
// int m = (2*i)-1;
// for (int j = 1; j <= m; j++) {
// if ( j == m || i == m || j == 1)
// System.out.print(i);
// else
// System.out.print( j );
// }
