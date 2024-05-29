package Operators_binary_number;

public class bit_operation_SET {
    public static void main(String[] args) {
        int num = 5;
        int pos = 3;
        int bitmask = 1 << 3;
        // 5 == 0101; third position is 0 
        // output must be 1101 == 13

        System.out.println("New number is : " + (num | bitmask));

    }
}








