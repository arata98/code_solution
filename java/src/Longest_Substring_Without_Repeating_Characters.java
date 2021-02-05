import java.util.ArrayList;
import java.util.List;

//3. Longest Substring Without Repeating Characters
//Given a string s, find the length of the longest substring without repeating characters.

//Example 1:
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

//Example 2:
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.

//Example 3:
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

//Example 4:
//Input: s = ""
//Output: 0
//
//Constraints:
//- 0 <= s.length <= 5 * 104
//- s consists of English letters, digits, symbols and spaces.

public class Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        List<String> candidates = new ArrayList<>();
        String candidate = "";

        // for sub string to find max longest substring
        for(int i = 0; i < s.length(); i++){
            String compareCandidate = "";
            for (int j = i; j < s.length(); j++) {
                Character ch = s.charAt(j);
                if (compareCandidate.contains(ch.toString())) {
                    break;
                }
                else{
                    compareCandidate = compareCandidate + ch.toString();
                }
            }
            // check length of candidate
            if(compareCandidate.length() > candidate.length()){
                candidate = compareCandidate;
            }
             candidates.add(compareCandidate);
        }

         System.out.println(candidate);
         System.out.println(candidates);
        return candidate.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
