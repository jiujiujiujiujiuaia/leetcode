import edu.princeton.cs.algs4.StdOut;
import javafx.scene.Scene;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by 87057 on 2018/3/13.
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        int CanGet = candies.length/2;
        HashSet<Integer> set = new HashSet<>();
        for(int a:candies) set.add(a);
        if(set.size()>=CanGet) return CanGet;
        else  return set.size();
    }
    public static void main(String[] args){
        HashMap map = new HashMap();
        int a = 4;
        map.put(1,2);
        map.put(1,100);
        StdOut.println(map.get(1));


    }

}
