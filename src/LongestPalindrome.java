import java.util.HashMap;
// 1 beat 35%
/**
 * Created by 87057 on 2018/3/13.
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int total = 0;
        int flag = 0;
        for(Character a:s.toCharArray())
        {
            if(map.containsKey(a)) map.put(a,map.get(a)+1);
            else  map.put(a,1);
        }
        for(Integer value:map.values()){
            if(value%2 == 0)total +=value;
            else {
                if(value == 1) flag =1;
                total  = total +value -1;
            }
        }
        if(flag == 1) total +=1 ;
        return total;
    }
}
