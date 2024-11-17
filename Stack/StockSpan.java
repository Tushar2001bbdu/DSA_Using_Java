/*
 Afzal has been working with an organization called 'Money Traders for the past few years. The organization is in the money trading business. His manager assigned him a task.



Given an array ’prices’ which denotes stock prices for ’n’ days, e.g., 'prices[ i ]' = price of the stock at ‘ith’ day, Find the stock's span for each day.



The span of the stock's price today is defined as the maximum number of consecutive days(starting from today and going backward) for which the price of the stock was less than today's price.



Example:
Input: ‘n’ = 7,  ‘prices’ = [100, 80, 60, 70, 60, 75, 85]

Output: [1, 1, 1, 2, 1, 4, 6]

Explanation: 
On the sixth day, when the stock price was 75, 

The span came out to be 4 because the last three prices(plus today) were less than the current or the sixth day's price.

Similarly, we can deduce the remaining results.
Note:
You don’t need to print anything. Just implement the given function
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
4
2 1 2 4
Sample Output 1:
1 1 2 4
Explanation Of Sample Input 1:
Number of consecutive days with price smaller than 0th day(starting from 0th day) = 1

Number of consecutive days with price smaller than 1st day(starting from 1st day) = 1

Number of consecutive days with price smaller than 2nd day(starting from 2nd day) = 2

Number of consecutive days with price smaller than 3rd day(starting from 3rd day) = 4 
Sample Input 2:
6
20 12 1 28 16 20 
Sample Output 2:
1 1 1 4 1 2 
Explanation Of Sample Input 2:
Number of consecutive days with price smaller than 0th day(starting from 0th day) = 1

Number of consecutive days with price smaller than 1st day(starting from 1st day) = 1

Number of consecutive days with price smaller than 2nd day(starting from 2nd day) = 1

Number of consecutive days with price smaller than 3rd day(starting from 3rd day) = 4 

Number of consecutive days with price smaller than 3rd day(starting from 4th day) = 1

Number of consecutive days with price smaller than 3rd day(starting from 5th day) = 2 
Expected time complexity:
The expected time complexity is O(n).
Constraints :
1 <= n <= 10^6
1 <= prices[i] <= 10^9
Time Limit: 1 sec
 */
import java.util.*;
public class Solution {
    public static int[] findStockSpans(int []prices) {
        // Write your code here.
        Stack<Integer> st=new Stack<>();
         Stack<Integer> st1=new Stack<>();
        int[] days=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            if(st.size()==0){
                st.push(prices[i]);
                st1.push(1);
                days[i]=1;
            }
            else{
                int sum=1;
                while(st.size()>0 && prices[i]>st.peek()){
                    sum=sum+st1.peek();
                    st1.pop();
                    st.pop();
                }
                st.push(prices[i]);
                st1.push(sum);
                days[i]=sum;

            }
        }
        return days;
    }
}