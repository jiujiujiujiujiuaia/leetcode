import edu.princeton.cs.algs4.StdOut;

import java.util.*;
// tips 1 Hashmap 不能识别char[]对象 也就是说有一个相同的char[] 使用map.containsKey() 返回的是false
// 2char[]   a={ 'a ', 'b ', 'c '};
//String   b=new   String(a);//字符数组到字符串
//        char[]   c=b.toCharArray();//字符串转换成字符数组

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();

        HashMap<String,List<String>> map = new HashMap<>();
        for(String string :strs){
            char[] cha = string.toCharArray();
            Arrays.sort(cha);
           String strings =  new String(cha);

            if(!map.containsKey(strings)) { List<String> array = new ArrayList<>();array.add(string);map.put(strings,array);}
            else{
                map.get(strings).add(string);
            }
        }
        Iterator iter = map.entrySet().iterator();
        List<String> integ =null;
        while(iter.hasNext()) {
            Map.Entry entry = (Map.Entry)iter.next();
            // 获取key
            String key = (String)entry.getKey();

            // 获取value
            integ = (List<String>)entry.getValue();
            list.add(integ);
    }
    return list;}
    public static void main(String[] args){
        String[] string = {"eat", "tea", "tan", "ate", "nat", "bat"};
        StdOut.println(groupAnagrams(string));
        char[] cha = {'a','b'};
        String strings = cha.toString();
        StdOut.println(strings);
//        HashMap maps = new HashMap();
//        char[] cha = {'a','b'};
//        char[] chas = {'a','b'};
//        maps.put(cha,1);
//        if(maps.containsKey(chas)) StdOut.println("nice");
//        else StdOut.println("false");
    }
}
