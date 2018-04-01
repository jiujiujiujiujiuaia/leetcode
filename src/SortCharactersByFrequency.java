// tip 1 collection 下面的三个list 就和之前学过的顺序表和链表是一样的 add就是插入啊 不是覆盖
//  2  把List类转换为普通的数组对象 有点麻烦并且我不是很懂
import edu.princeton.cs.algs4.StdOut;

import java.util.*;

/**
 * Created by 87057 on 2018/3/21.
 */
public class SortCharactersByFrequency {
    public static void exchange(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void sort(Comparable[] a,Comparable[] b){
        int n = a.length;
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(a[j].compareTo(a[min])>0) min =j;
            }
            exchange(a,min,i);
            exchange(b,min,i);
        }
    }

    public static String mergetoString(Character[] a,Integer[] b){
        ArrayList<Character> c = new ArrayList();
        for(int i =0;i<b.length;i++){
            for(int j = 0;j<b[i];j++){
                c.add(a[i]);
            }
        }
        int i = 0;
       char[] cha = new char[c.size()];
        for(Character d:c){
            cha[i++] = d;
        }
        return (new String(cha));
    }
      public static void solution1(String s){
          ArrayList<Integer> listfrequency = new ArrayList<Integer>();
          ArrayList<Character> listchar = new ArrayList<Character>();
          char[] a = s.toCharArray();
          for(char b:a){
              if(listchar.contains(b)) {int index = listchar.indexOf(b);
                  int value =(int)listfrequency.get(index);
                  listfrequency.remove(index);
                  listfrequency.add(index,value+1);}
              else {listfrequency.add(1);listchar.add(b);}
          }
          Character[]  arraychar =  listchar.toArray(new Character[listchar.size()]);
          Integer[] arrayfrequency =  listfrequency.toArray(new Integer[listfrequency.size()]);
          sort(arrayfrequency,arraychar);
          StdOut.println(mergetoString(arraychar,arrayfrequency));
    }
    public static String solution2(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Character>[] buket = new ArrayList[s.length()+1];
        for(char key:s.toCharArray())
        if(map.containsKey(key)) map.put(key,map.get(key)+1);
        else map.put(key,1);
        for(Map.Entry m:map.entrySet()){
            int index = (int)m.getValue();
            if(buket[index] == null) buket[index] = new ArrayList<Character>();//这个地方要注意一下 你只为了这个数组分配了空间 没有为其中的ArrayList
            buket[index].add((Character)m.getKey());//的对象分配空间
        }
        StringBuilder sb = new StringBuilder();
        for(int i = buket.length;i>0;i++){
            if(buket[i] != null){
                for(Character a :buket[i]){
                    for(int j = 0;j<buket[i].size();j++){
                        sb.append(a);
                    }
                }
            }
        }
        return sb.toString();
    }




    public static void main(String[] args){
        String s = "tree";
        solution2(s);
    }

}
