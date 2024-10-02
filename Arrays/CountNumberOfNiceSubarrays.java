/*
Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

Return the number of nice sub-arrays.

 

Example 1:

Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
Example 2:

Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There are no odd numbers in the array.
Example 3:

Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
Output: 16
 

Constraints:

1 <= nums.length <= 50000
1 <= nums[i] <= 10^5
1 <= k <= nums.length
*/
class Solution {
    public int  getNumberOfSubarrays(int[] arr,int k){
        if(k<0){
            return 0;
        }
        int count=0,l=0,r=0,c=0;
        while(r<arr.length){
            if(arr[r]%2!=0){
                count=count+1;
            }
            while(count>k && l<arr.length){
                if(arr[l]%2!=0){
                    count=count-1;
                }
                l++;
            }
           
            if(count<=k){
            c=c+(r-l+1);    
            }
            
           r++; 
        }
        return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
    return (getNumberOfSubarrays(nums,k)-getNumberOfSubarrays(nums,k-1));
    }
}
