import edu.princeton.cs.algs4.StdOut;

import java.util.HashSet;

/**
 * Created by 87057 on 2018/2/27.
 */
public class IntersectionofTwoArrays2 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> setNum1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            setNum1.add(nums1[i]);

        }
        for(int j = 0;j<nums2.length;j++){
            if(setNum1.contains(nums2[j])) resultSet.add(nums2[j]);
        }
        int j = 0;
        int[] result = new int[resultSet.size()] ;
        for(Integer a :resultSet){
            result[j++] = a;
        }
        return result;
    }
    public static void main(String[] args){
       int[] num1 = {1};
        int[] num2 = {1};
        int[] result = intersection(num1,num2);
        for(int i = 0;i<result.length;i++){
            StdOut.println(result[i]);
        }
    }
}
