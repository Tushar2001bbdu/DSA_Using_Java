/*
Given a binary array arr[] and an integer target, return the number of non-empty subarrays with a sum equal to the target.
Note: A subarray is the contiguous part of the array.

Examples:

Input: arr[] = [1, 0, 1, 0, 1], target = 2
Output: 4
Explanation: There are four subarrays with sum equal to target: arr[0..2], arr[0..3], arr[1..4], arr[2..4].
Input: arr[] = [1, 1, 0, 1, 1], target = 5
Output: 0
Explanation: There are no subarrays with sum target.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ target ≤ arr.size()
0 ≤ arr[i] ≤ 1
*/
class Solution {
    public int getNumberOfSubarrays(int[] ar,int target){
     if(target<0){
         return 0;
     }
     int l=0,r=0,sum=0,count=0;
     while(r<ar.length){
         sum=sum+ar[r];
         while(sum>target){
             sum=sum-ar[l];
             l++;
         }
         count=count+(r-l+1);
         r++;
     }
     return count;
    }
    public int numberOfSubarrays(int[] arr, int target) {
        // code here
   int count=getNumberOfSubarrays(arr,target)-getNumberOfSubarrays(arr,target-1);
    return count;
    }
}
