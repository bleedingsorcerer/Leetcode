class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int revNum = 0;
        int temp = x;

        while(temp>0){
            int lastDigit = temp%10;
            revNum = (revNum*10)+lastDigit;
            temp/=10;
        }

        if(revNum==x){
            return true;
        }else{
            return false;
        }
    }
}