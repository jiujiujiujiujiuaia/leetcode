import edu.princeton.cs.algs4.StdOut;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 87057 on 2018/3/11.
 */
public class ArrayPartitionI
{
    public static int less(int i ,int j ){
        if(i>j){
            return i;
        }
        else{
            return j;
        }
    }

    public int arrayPairSum(int[] nums) {
        int total = 0;
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i=i+2){
            total += less(nums[i],nums[i+1]);
        }
        return total;
    }
    public static void main(String[] args){



    }
}
