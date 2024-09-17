class Solution {
    public String largestOddNumber(String num) {
        // Traverse from end to start
        for (int i = num.length() - 1; i >= 0; i--) {
            // Convert character to integer
            int digit = num.charAt(i) - '0';
            // Check if the digit is odd
            if (digit % 2 != 0) {
                // Return the substring up to and including this digit
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit is found, return an empty string
        return "";
    }
}
