class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Initialize variables
        int maxLength = 0;                   // This will store the length of the longest substring found
        int left = 0;                        // This will mark the left boundary of the current window
        Map<Character, Integer> count = new HashMap<>();  // This map will keep track of character frequencies
        
        // Loop through the string using a sliding window approach
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);  // Current character at the right end of the window
            
            // Update the frequency map with the current character
            count.put(c, count.getOrDefault(c, 0) + 1);
            
            // If there is a duplicate character in the current window, shrink the window from the left
            while (count.get(c) > 1) {
                char leftChar = s.charAt(left);  // Character at the left end of the window
                count.put(leftChar, count.get(leftChar) - 1);  // Decrease its count in the map
                left++;  // Move the left boundary of the window to the right
            }
            
            // Calculate the maximum length of substrings found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        // Return the maximum length found
        return maxLength;
    }
}
