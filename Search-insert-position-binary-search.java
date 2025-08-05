
// Problem Link : https://leetcode.com/problems/search-insert-position/

// Time Complexity:O(logn)
// Space Complexity:O(1)

public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return left;
    }
