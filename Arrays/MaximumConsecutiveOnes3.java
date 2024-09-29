/*
 Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
0 <= k <= nums.length
 */

 class Solution {
    public int longestOnes(int[] nums, int k) {
     int max_len=0;
     int len=0;
     int l=0,r=0;
     int zeros=0;
     int point=-1;
     while(r<nums.length){
     if(nums[r]==0){
          zeros=zeros+1;  
     }
     while(zeros>k){
     if(zeros==k){
         
         break;
     }
         if(nums[l]==0){
             zeros=zeros-1;
         }
        l++;
     }
      len=r-l+1;
        if(nums[r]==0){
            point=r;
        }
    r++;
      max_len=(int)Math.max(max_len,len);
        
     }
    return max_len;
    }
}
