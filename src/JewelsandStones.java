import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 87057 on 2018/3/11.
 */
public class JewelsandStones {
    public static int solution(String s,String j){
        char[] arrayS =  s.toCharArray();
        Arrays.sort(arrayS);
        s = new String(arrayS);

        char[] arrayJ =  j.toCharArray();
        Arrays.sort(arrayJ);
        j = new String(arrayJ);
        s += " ";
        int total = 0;
        for(int i =0,k = 0;i<j.length() && k<s.length()-1;){
            if(j.charAt(i) == s.charAt(k)) {
                k++;
                total++;
                continue;
            }
            else if(s.charAt(k)<j.charAt(i)&&j.charAt(i)<s.charAt(k+1)||j.charAt(i)<s.charAt(k)){
                i++;
                continue;
            }
            else if(j.charAt(i)>s.charAt(k)){
                k++;
                continue;
            }
        }
        return total;
    }

    public static int solution2(String J,String S){
        int flag = 0;
        Set setJ = new HashSet<>();
        for(char j:J.toCharArray() ) setJ.add(j);
        for(char s:S.toCharArray())if(setJ.contains(s)) flag++;
        return flag;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        for(int b:a){
            StdOut.println(b);
        }
    }
}
