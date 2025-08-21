// Time Complexity: O(N)
// Space Complexity: O(1)

// sliding window

class Solution {
    public int numberOfSubstrings(String s) {
        int freq[]=new int[3];
        int left=0;
        int cntSubString=0;
        for(int right=0;right<s.length();right++)
        {
            freq[s.charAt(right)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0)
            {
                cntSubString+=s.length()-right;
                freq[s.charAt(left)-'a']--;
                left++;
            }
        }
        return cntSubString;
    }
}
