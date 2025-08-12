// Problem Link : https://leetcode.com/problems/number-of-good-pairs/description/

// Java Code
// ********************* Brute Force Approach **************************

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

// ********************* Optimised Approach using HashMap (frequency count) **************************

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int pairs=0;
        for(int key:map.keySet())
        {
            int val=map.get(key);
            pairs+=(val*(val-1)/2);
        }
        return pairs;
    }
}
