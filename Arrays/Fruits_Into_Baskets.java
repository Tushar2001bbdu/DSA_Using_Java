/*
 You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.

 

Example 1:

Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees.
Example 2:

Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].
Example 3:

Input: fruits = [1,2,3,2,2]
Output: 4
Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].
 

Constraints:

1 <= fruits.length <= 105
0 <= fruits[i] < fruits.length
 */
import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
     HashMap<Integer,Integer> hash=new HashMap<>();
     int l=0,r=0;int max_len=0;
    /*O(2*n) approach
    while(r<fruits.length){
        
             if(hash.containsKey(fruits[r])==false){
            hash.put(fruits[r],1);
        }
else{
    int d=hash.get(fruits[r]);
    hash.replace(fruits[r],d+1);
}
        while(hash.size()>2){
         int d=hash.get(fruits[l]);
         hash.replace(fruits[l],d-1);
         if(hash.get(fruits[l])==0){
             hash.remove(fruits[l]);
         }
        l=l+1;
        }    
        
        int len=r-l+1;
        max_len=(int)Math.max(len,max_len);
   
        r++;
    }
    */
        int len=0;
            while(r<fruits.length){
        
             if(hash.containsKey(fruits[r])==false){
            hash.put(fruits[r],1);
        }
else{
    int d=hash.get(fruits[r]);
    hash.replace(fruits[r],d+1);
}
        if(hash.size()>2){
         int d=hash.get(fruits[l]);
         hash.replace(fruits[l],d-1);
         if(hash.get(fruits[l])==0){
             hash.remove(fruits[l]);
         }
        l=l+1;
        
        }
        if(hash.size()<=2){
              len=r-l+1;
        max_len=(int)Math.max(len,max_len);   
        }
   
        
        
   
   
        r++;
    }
    return max_len;
    }
}