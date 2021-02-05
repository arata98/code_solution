class Solution {
    public static int lengthOfLongestSubstring(String s) {
        // List<String> candidates = new ArrayList<>();
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
            // candidates.add(compareCandidate);
        }

        // System.out.println(candidate);
        // System.out.println(candidates);
        return candidate.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}