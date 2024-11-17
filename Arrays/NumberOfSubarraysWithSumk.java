/*
 Given an unsorted array of integers, find the number of continuous subarrays having sum exactly equal to a given number k.


Example 1:

Input:
N = 5
Arr = {10 , 2, -2, -20, 10}
k = -10
Output: 3
Explaination: 
Subarrays: arr[0...3], arr[1...4], arr[3..4]
have sum exactly equal to -10.

Example 2:

Input:
N = 6
Arr = {9, 4, 20, 3, 10, 5}
k = 33
Output: 2
Explaination: 
Subarrays : arr[0...2], arr[2...4] have sum
exactly equal to 33.
 */class Solution
{
    static int findSubArraySum(int Arr[], int N, int k)
    {
        // code here
        HashMap<Integer,Integer> hash=new HashMap<>();
        hash.put(0,1);
        int count=0,sum=0;
        for(int i=0;i<Arr.length;i++){
            sum=sum+Arr[i];
            if(hash.containsKey(sum-k)){
                count=count+hash.get(sum-k);
            }
            if(hash.containsKey(sum)){
                int d=hash.get(sum);
                hash.replace(sum,(d+1));
            }
            else{
                hash.put(sum,1);
            }
        }
        return count;
    }
}
