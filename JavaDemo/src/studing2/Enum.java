package studing2;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public  class Enum {
    static{
        System.out.println("��̬�����");
    }
    {
        System.out.println("��static�����");
    }

    public Enum(){
        System.out.println("123");
    }
/*    public static void main(String[] args) {*//*
        Map<String, String>map = new HashMap<String,String>();
        map.put("student1", "��ΰ");
        map.put("student2", "С��");
        map.put("student3", "С��");
        map.put("student4", "С��");

        System.out.println("ͨ��map.entrySet����key��value(�Ƽ�ʹ�ã��ر���������ʱ)");
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
