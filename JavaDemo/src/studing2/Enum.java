package studing2;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public  class Enum {
    static{
        System.out.println("静态代码块");
    }
    {
        System.out.println("无static代码块");
    }

    public Enum(){
        System.out.println("123");
    }
/*    public static void main(String[] args) {*//*
        Map<String, String>map = new HashMap<String,String>();
        map.put("student1", "阿伟");
        map.put("student2", "小李");
        map.put("student3", "小张");
        map.put("student4", "小王");

        System.out.println("通过map.entrySet遍历key和value(推荐使用，特别是容量大时)");
        for(Map.Entry<String, String> entry:map.entrySet()){
            System.out.println("key="+entry.getKey()+"\tvalue="+entry.getValue());
        }*//*
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"1");
        map.put(2,"2");
        Iterator it = map.entrySet().iterator();
        for (int i = 0;i<map.size();i++){
            if (it.hasNext())
                System.out.println(it.next());
        }
        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }*/



}
