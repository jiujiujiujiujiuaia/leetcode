import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 87057 on 2018/3/19.
 */
public class findDuplicates {
    public static List<Integer> c(int[] nums) {
        ArrayList res = new ArrayList();
       for(int i = 0;i<nums.length;i++){
            if(!res.contains(nums[i])) res.add(nums[i]);
            else nums[i] = 2;
        }
        res.clear();
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 2){
                res.add(nums[i]);
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        StdOut.println(c(nums));
    }

}
