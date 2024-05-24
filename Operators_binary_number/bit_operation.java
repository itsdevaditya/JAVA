package Operators_binary_number;

public class bit_operation {
    public static void main(String[] args) {
        int num = 5;
        int pos = 2;
        int bitmas = 1 << 2;
        if ((bitmas & num) == 0) {
            System.out.println("bit was 0 ");
        }
        else
        System.out.println("bit was 1 ");
    }
}
