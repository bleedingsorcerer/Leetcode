class Solution {
    public int reverse(int x) {
     int reversedNum = 0;
        int temp = Math.abs(x);

        while (temp > 0) {
            int lastDigit = temp % 10;

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
