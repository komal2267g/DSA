public class UpdateBit {

    // Method to clear the ith bit
    public static int clearIthBit(int n, int i) {
        return n & ~(1 << i);
    }

    // Method to set the ith bit
    public static int setIthBit(int n, int i) {
        return n | (1 << i);
    }

    // Method to update the ith bit
    public static int updateIthBit(int n, int i, int value) {
        if (value == 1) {
            return setIthBit(n, i);
        } else {
            return clearIthBit(n, i);
        }
    }

    public static void main(String[] args) {
        // Test the methods
        System.out.println(updateIthBit(10, 2, 1)); // Sets the 2nd bit of 10 to 1
        System.out.println(updateIthBit(10, 2, 0)); // Clears the 2nd bit of 10
    }
}
