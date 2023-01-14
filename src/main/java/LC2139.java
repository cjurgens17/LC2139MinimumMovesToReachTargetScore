import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class LC2139 {

    public static void main(String[] args) {
        System.out.println(minMoves(5,0));
        System.out.println(minMoves(19,2));
        System.out.println(minMoves(10,4));
    }
    //2139. Minimum Moves to Reach Target Score
    //Medium
    //737
    //14
    //Companies
    //You are playing a game with integers. You start with the integer 1 and you want to reach the integer target.
    //
    //In one move, you can either:
    //
    //Increment the current integer by one (i.e., x = x + 1).
    //Double the current integer (i.e., x = 2 * x).
    //You can use the increment operation any number of times, however, you can only use the double operation at most maxDoubles times.
    //
    //Given the two integers target and maxDoubles, return the minimum number of moves needed to reach target starting with 1.
    //
    //
    //
    //Example 1:
    //
    //Input: target = 5, maxDoubles = 0
    //Output: 4
    //Explanation: Keep incrementing by 1 until you reach target.
    //Example 2:
    //
    //Input: target = 19, maxDoubles = 2
    //Output: 7
    //Explanation: Initially, x = 1
    //Increment 3 times so x = 4
    //Double once so x = 8
    //Increment once so x = 9
    //Double again so x = 18
    //Increment once so x = 19
    //Example 3:
    //
    //Input: target = 10, maxDoubles = 4
    //Output: 4
    //Explanation: Initially, x = 1
    //Increment once so x = 2
    //Double once so x = 4
    //Increment once so x = 5
    //Double again so x = 10
    //
    //
    //Constraints:
    //
    //1 <= target <= 109
    //0 <= maxDoubles <= 100

    public static int minMoves(int target, int maxDoubles){
        //Think of Greedy Approach, then we realize we need to use all maxDoubles as soon as possible
        int ans = 0;

        while(target > 1 && maxDoubles > 0){
            if(target % 2 == 0){
                target /= 2;
                maxDoubles--;
            }else{
                target -= 1;
            }
            ans++;
        }
        //Here we use target - 1 becuase we counted all moves from maxDouble
        //any remaining moves must be decrementing by 1, which in turn is equivalent to the value
        //target, and we subtract one because we end at 1, so we dont count that decrement; all but 1
        //Also if target is already at 1 from our original operation, this will add 0 moves,
        //which is excatly what we want.
        return ans + target - 1;
    }
}
