import edu.princeton.cs.algs4.StdOut;

import java.util.*;
//tips:1 char对应的对象是 Character
/**
 * Created by 87057 on 2018/3/12.
 */
public class What {
    public static String[] findWords(String[] words) {

        HashMap<Integer,Set> map = new HashMap();
        ArrayList<String> array = new ArrayList();
        String[] keyborad = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        int i = 0;
        for (String string : keyborad) {
            Set set = new HashSet();
            for (char cha : string.toCharArray()) {
                set.add(cha);
            }
            map.put(i++, set);
        }

        for (String strings : words) {
            String string = strings.toLowerCase();
            if (map.get(0).contains(string.charAt(0))) {
                int q = 1;
                for (char a : string.toCharArray())
                {
                    if (!map.get(0).contains(a)) break;
                     if(map.get(0).contains(a)) ++q;
                     if(q == string.toCharArray().length) array.add(strings);

                }
            } else if (map.get(1).contains(string.charAt(0))) {

                int q = 0;
                for (char a : string.toCharArray())
                {
                    if (!map.get(1).contains(a)) break;
                    if(map.get(1).contains(a)) ++q;
                    if (q == string.toCharArray().length) array.add(strings);

                }


            } else if (map.get(2).contains(string.charAt(0))) {
                int q = 1;
                for (char a : string.toCharArray())
                {
                    if (!map.get(2).contains(a)) break;
                 if(map.get(2).contains(a)) ++q;
                 if(q == string.toCharArray().length) array.add(strings);

                }

        }

    }
        int a = 0;
        String[] word = new String[array.size()];
        for(String b :array) word[a++] = b;
    return word;
    }
    public static void main(String[] args){
       int a = 5;
        if(a<1) StdOut.println(1);
         else if(a>2)  StdOut.println(2);
        else if(a>3)  StdOut.println(3);
        else if(a>4)  StdOut.println(4);
    }
}
