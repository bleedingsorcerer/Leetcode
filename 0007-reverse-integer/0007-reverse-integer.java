class Solution {
    public int reverse(int x) {
     int reversedNum = 0;
        int temp = Math.abs(x);

        while (temp > 0) {
            int lastDigit = temp % 10;

            // Check for overflow before updating reversedNum
            if (reversedNum > (Integer.MAX_VALUE - lastDigit) / 10) {
                return 0; // Overflow detected
            }

            reversedNum = reversedNum * 10 + lastDigit;
            temp /= 10;
        }

        // Restore the sign if the original number was negative
        if (x < 0) {
            reversedNum = -reversedNum;
        }

        return reversedNum;
    }
}
