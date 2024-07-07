class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filteredString = new StringBuilder();

        // Step 1: Filter and convert to lowercase
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isLetterOrDigit(currentChar)) {
                filteredString.append(Character.toLowerCase(currentChar));
            }
        }

        // Step 2: Check if the filtered string is a palindrome
        int left = 0, right = filteredString.length() - 1;
        while (left < right) {
            if (filteredString.charAt(left) != filteredString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    }
