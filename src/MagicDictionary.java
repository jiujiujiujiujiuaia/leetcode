import edu.princeton.cs.algs4.StdOut;
import java.util.*;
//tip 1 :int[] pair = new int[] {1, word1.charAt(1)}; char 会在Int数组中自动转换为相应的数字

/**
 * Created by 87057 on 2018/3/14.
 */
public class MagicDictionary {
    private HashMap<String,ArrayList> map  = new HashMap<>();
    public MagicDictionary() {

    }

    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {

        for(String string :dict){
            ArrayList<Character> array = new ArrayList<>();
            for(Character cha:string.toCharArray()) array.add(cha);
            map.put(string,array);
        }
    }

    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {

        int length = word.length();
        ArrayList<Character> array = new ArrayList<>();
        for(Character cha:word.toCharArray()) array.add(cha);
        ArrayList integ = null;
        Iterator iter = map.entrySet().iterator();
        while(iter.hasNext()) {
            int flag = 0;
            Map.Entry entry = (Map.Entry)iter.next();
            // 获取key
            String key = (String)entry.getKey();
            // 获取value
            integ = (ArrayList)entry.getValue();
            if(length == key.length() ){
                for(int i = 0;i<array.size();i++){
                    if(!(integ.get(i) == array.get(i))){
                        flag ++;
                    }
                }
            }
            if(flag == 1) return true;
        }

         return false;
    }

    public  static void  main (String[] args){
        String[] dict= {"hello", "leetcode","hallo"};

        String word1 = "hello";
        String word2 = "hhllo";
        String word3 = "hell";
        String word4 = "leetcoded";



        MagicDictionary obj = new MagicDictionary();
         obj.buildDict(dict);
        StdOut.println(obj.search(word1));
        StdOut.println(obj.search(word2));
        StdOut.println(obj.search(word3));
        StdOut.println(obj.search(word4));

    }
}
