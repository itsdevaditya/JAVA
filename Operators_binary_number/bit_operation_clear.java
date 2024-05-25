package Operators_binary_number;

public class bit_operation_clear {
    public static void main(String[] args) {
    int num = 5;
    int pos = 2;
    int bitmas = 1 << 2;
    // bitmas == 0100
    //  ~bitmask == 1011
    int not_bitMask = ~bitmas;
    // 5 == 0101; second  position is 1 
        // output must be 0001 == 1
    System.out.println("Your new number is : " + (num & not_bitMask));
}
}
