class Solution {
    /**
     * Optimized method to decrypt the circular array using a sliding window.
     *
     * Time Complexity: O(n), as we use a sliding window approach and process the array in one pass.
     * Space Complexity: O(n), for the result array.
     *
     * @param code The input circular array.
     * @param k    The decryption key indicating the range of sums.
     * @return The decrypted array.
     */
    public int[] decrypt(int[] code, int k) {
        int n = code.length; // Length of the input array.
        int[] res = new int[n]; // Result array to store decrypted values.

        // If k is 0, replace every element with 0 and return.
        if (k == 0) return res;

        // Determine the initial range of the sliding window.
        int start = 1, end = k, sum = 0;
        if (k < 0) {
            // For negative k, calculate the range of previous `|k|` elements.
            start = n - Math.abs(k); // Start index of the window.
            end = n - 1;            // End index of the window.
        }

        // Calculate the initial sum of the first window.
        for (int i = start; i <= end; i++) {
            sum += code[i % n];
        }

        // Slide the window across the array.
        for (int i = 0; i < n; i++) {
            res[i] = sum; // Assign the current sum to the result array.

            // Adjust the sliding window:
            // Subtract the element that is sliding out of the window.
            sum -= code[start % n];
            // Add the element that is sliding into the window.
            sum += code[(end + 1) % n];

            // Move the start and end pointers of the window.
            start++;
            end++;
        }

        return res;
    }

    /**
     * Brute force approach to decrypt the circular array.
     *
     * Time Complexity: O(n * |k|), as we loop through the array and compute sums explicitly for each index.
     * Space Complexity: O(n), for the result array.
     *
     * @param code The input circular array.
     * @param k    The decryption key indicating the range of sums.
     * @return The decrypted array.
     */
    public int[] decryptBruteForce(int[] code, int k) {
        int n = code.length; // Length of the input array.
        int[] res = new int[n]; // Result array to store decrypted values.

        // If k is 0, replace every element with 0 and return.
        if (k == 0) return res;

        // Loop through each element in the array.
        for (int i = 0; i < n; i++) {
            if (k > 0) {
                // For positive k, sum the next k elements (circularly).
                for (int j = i + 1; j < i + 1 + k; j++) {
                    res[i] += code[j % n]; // Use modulo to handle circular indexing.
                }
            } else {
                // For negative k, sum the previous |k| elements (circularly).
                for (int j = i - Math.abs(k); j < i; j++) {
                    res[i] += code[(j + n) % n]; // Use modulo to handle negative indices.
                }
            }
        }

        return res;
    }
}

/**
next (i+1+n)%n
prev (i-1+n)%n
 */