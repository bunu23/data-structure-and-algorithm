import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem Statement:
 * Write a function to generate binary numbers from 1 to n using a queue.
 *
 * For example:
 * Input: n = 3
 * Output: ["1", "10", "11"]
 * Approach:
 * 1. Initialize a queue to hold the binary numbers as strings.
 * 2. Start with the binary number "1" in the queue.
 * 3. Use a loop to iterate `n` times:
 * a. Poll (remove) the front element from the queue.
 * b. Store the current binary number in an array.
 * c. Generate the next two binary numbers by appending "0" and "1" to the
 * current number and add them back to the queue.
 * 4. Return the array of binary numbers after generating `n` numbers.
 *
 */

public class GenerateBinaryNumbers {

    public static String[] generateBinaryNumbers(int n) {
        String[] result = new String[n];
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        for (int i = 0; i < n; i++) {
            result[i] = queue.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            queue.offer(n1);
            queue.offer(n2);
        }
        return result;
    }

    public static void main(String[] args) {

        int n1 = 3;
        String[] binarynum1 = generateBinaryNumbers(n1);
        System.out.println("Binary numbers from 1 to " + n1 + ": " + String.join(", ", binarynum1));

        int n2 = 5;
        String[] binarynum2 = generateBinaryNumbers(n2);
        System.out.println("Binary numbers from 1 to " + n2 + ": " + String.join(", ", binarynum2));
    }

}
