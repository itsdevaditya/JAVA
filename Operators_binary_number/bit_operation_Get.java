package Operators_binary_number;

public class bit_operation_Get {
    public static void main(String[] args) {
        int num = 5;
        // find 2nd bit of 5 in binary number 
        // 5 == 0101 
 //possition == 3210
        int pos = 2;
        int bitmas = 1 << 2;
        if ((bitmas & num) == 0) {
            System.out.println("bit was 0 ");
        }
        else
        System.out.println("bit was 1 ");
    }
}
