package studing2;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class Battle {
    private  int anInt;



    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        FileReader fileReader = new FileReader("D:\\JAVA\\Work\\JavaDemo\\src\\studing2\\class.properties");
        Properties properties = new Properties();
        try {
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileReader.close();
        Set name = properties.stringPropertyNames();
        Object[] key = name.toArray();
        for (int i  = 0;i<key.length;i++){
            System.out.println(key[i]);
            System.out.println(properties.getProperty((String) key[i]));

        }
        /*Set<Object> keys = properties.keySet();//返回属性key的集合
        System.out.println(keys);
        for (Object key : keys) {
            System.out.println(key);
            System.out.println(key.toString() + "=" + properties.get(key));
        }*/



        /*Class c = Class.forName(name);
        Object obj = c.newInstance();
        System.out.println(obj);*/
/*        String path = Thread.currentThread().getContextClassLoader().getResource("studing2/class.properties").getPath();
        System.out.println(path);*/
     /*   ResourceBundle resourceBundle = ResourceBundle.getBundle("studing2\\class");
        System.out.println(resourceBundle.getString("map"));*/

       /* Class c = Class.forName("studing2.BattleTest");
        Object obj = c.newInstance();
        Field field[] = c.getDeclaredFields();
        for (Field g:field)
            g.setAccessible(true);
        for (Field f:field){
            System.out.println(f.get(obj));
        }*/
        
    }

}
