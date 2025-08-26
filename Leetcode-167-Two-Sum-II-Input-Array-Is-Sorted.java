// Problem link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

// time complexity : O(n)
// space complexity : O(1)

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right)
        {
            int sum=numbers[left]+numbers[right];
            if(sum==target)
            {
                return new int[]{left+1, right+1};
            }
            else if(sum<target)
            {
                left++;
            }
            else 
            {
                right--;
            }
        }
        return new int[]{0, 0};
    }
}
