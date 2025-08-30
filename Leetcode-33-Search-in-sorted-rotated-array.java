
// Time Complexity:O(logn)
// Space Complexity:O(1)


class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            // check if first half is sorted
            else if(nums[mid]>=nums[left])
            {
                // if it is between the left and mid
                if(nums[left]<=target && target<=nums[mid])
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else
            {
                if(nums[right]>=target && target>=nums[mid])
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
