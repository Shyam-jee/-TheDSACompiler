
// Time Complexity : O(N)
// Space Complexity : O(1)

class Solution {
    public boolean check(int[] nums) {
        if(nums.length==0) return true;
        boolean isRotated=false;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>=nums[i-1])
            {
                continue;
            }
            else if(!isRotated)
            {
                isRotated=true;
            }
            else
            {
                return false;
            }
        }
        if(!isRotated) return true;
        return nums[0]>=nums[nums.length-1];
    }
}
