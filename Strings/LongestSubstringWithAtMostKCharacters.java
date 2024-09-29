/*
 
Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.

Example 1:

Input:
S = "aabacbebebe", K = 3
Output: 
7
Explanation: 
"cbebebe" is the longest substring with 3 distinct characters.
Example 2:

Input: 
S = "aaaa", K = 2
Output: -1
Explanation: 
There's no substring with 2 distinct characters.
Your Task:
You don't need to read input or print anything. Your task is to complete the function longestKSubstr() which takes the string S and an integer K as input and returns the length of the longest substring with exactly K distinct characters. If there is no substring with exactly K distinct characters then return -1.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).

Constraints:
1 ≤ |S| ≤ 105
1 ≤ K ≤ 26
All characters are lowercase latin characters.



 */

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
    HashMap<Character,Integer> hash=new HashMap<>();
    int l=0,r=0;int max_len=-1;
    /*
    while(r<s.length()){
        if(hash.containsKey(s.charAt(r))){
            int freq=hash.get(s.charAt(r));
            hash.replace(s.charAt(r),(freq+1));
        }
        else{
            hash.put(s.charAt(r),1);
        }
     while(hash.size()>k && l<s.length()){
         int d=hash.get(s.charAt(l));
         if(d>1){
             hash.replace(s.charAt(l),d-1);
         }
         else{
             hash.remove(s.charAt(l));
         }
         l++;
     }
     if(l>=s.length()){
         break;
     }
     if(hash.size()==k){
         max_len=(int)Math.max(max_len,(r-l+1));
     }
     r++;
    }*/
    while(r<s.length()){
        if(hash.containsKey(s.charAt(r))){
            int freq=hash.get(s.charAt(r));
            hash.replace(s.charAt(r),(freq+1));
        }
        else{
            hash.put(s.charAt(r),1);
        }
    if(hash.size()>k && l<s.length()){
         int d=hash.get(s.charAt(l));
         if(d>1){
             hash.replace(s.charAt(l),d-1);
         }
         else{
             hash.remove(s.charAt(l));
         }
         l++;
     }
     if(l>=s.length()){
         break;
     }
     if(hash.size()==k){
         max_len=(int)Math.max(max_len,(r-l+1));
     }
     r++;
    }
    
    
    return max_len;
    }
}