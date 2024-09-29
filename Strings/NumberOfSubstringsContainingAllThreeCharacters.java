/*
 Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

 

Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
Example 2:

Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 
Example 3:

Input: s = "abc"
Output: 1
 

Constraints:

3 <= s.length <= 5 x 10^4
s only consists of a, b or c characters.
 */
class Solution {
    public int numberOfSubstrings(String s) {
    HashMap<Character,Integer> hash=new HashMap<>();
    hash.put('a',-1);
    hash.put('b',-1);
    hash.put('c',-1);int count=0;
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        hash.replace(ch,i);
        int A=hash.get('a');
        int B=hash.get('b');
        int C=hash.get('c');
        
    
    if(A==-1 || B==-1 || C==-1){
        continue;
    }
    int low=(int)Math.min(A,Math.min(B,C));
    count=count+low+1;
    }
    return count;
    }
}