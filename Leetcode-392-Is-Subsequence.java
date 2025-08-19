
Time Complexity: O(N)
Space Complexity:O(1)

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int s1=0;
        int t1=0;
        while(s1<s.length() && t1<t.length())
        {
            if(s.charAt(s1)==t.charAt(t1))
            {
                s1++;
            }
            t1++;
            
        }
        return s1==s.length();
    }
}
