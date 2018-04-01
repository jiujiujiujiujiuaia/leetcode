import edu.princeton.cs.algs4.StdOut;

/**
 * Created by 87057 on 2018/2/26.
 */
public class IntersectionofTwoArrays {
    public static int[] ArrayByself(int[] array){
        int n = array.length;
        int[] newarray = new int[n+1];
        for(int i =0;i<array.length;i++){
            newarray[i] = array[i];
        }
        return newarray;
    }
    public static boolean isExist(int[] array,int key){
        for(int i = 0;i<array.length;i++){
            if(key == array[i]) return true;
        }
        return false;
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] result = {} ;
        int j = 0;
        for(int i = 0;i<nums1.length;i++){
            if(isExist(nums2,nums1[i])&&(!isExist(result,nums1[i]))){
                result = ArrayByself(result);
             result[j++] = nums1[i];}

        }
        return result;
    }
    public static void main(String[]  args) {
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 2};
        int[] num3 = {};
        int[] num4 = {1};




        int[] result = intersection(num3,num4);
        for(int i = 0;i<result.length;i++){
            StdOut.println(result[i]);

        };
    }

}
