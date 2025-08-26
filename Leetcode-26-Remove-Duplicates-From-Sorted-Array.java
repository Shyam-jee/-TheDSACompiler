
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] arr) {
        int i=1;
        for(int j=1;j<arr.length;j++){
            if(arr[j-1]!=arr[j]){
                arr[i]=arr[j];     
                i++;
            }
        }
        return i;  //  length of modified array
    }
}
