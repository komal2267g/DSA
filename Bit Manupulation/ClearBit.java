public class ClearBit {

    // Method to clear the ith bit of n
    public static int clearIthBit(int n, int i) {
        // Create a bitmask to clear the ith bit
        int bitMask = ~(1 << i); // Bitmask for clearing the ith bit
        // Clear the ith bit using bitwise AND
        return n & bitMask;
    }

    // Method to set the ith bit of n
    public static int setIthBit(int n, int i) {
        // Create a bitmask to set the ith bit
        int bitMask = 1 << i; // Bitmask for setting the ith bit
        // Set the ith bit using bitwise OR
        return n | bitMask;
    }

    public static void main(String[] args) {
        int n = 15; // Example number (1111 in binary)
        int i = 1;  // Index of the bit to clear (0-based)

        // Calling the clearIthBit method to clear the ith bit
        n = clearIthBit(n, i);
        System.out.println("After clearing the " + i + "th bit: " + n);

        // Calling the setIthBit method to set the ith bit again
        n = setIthBit(n, i);
        System.out.println("After setting the " + i + "th bit: " + n);
    }
}
