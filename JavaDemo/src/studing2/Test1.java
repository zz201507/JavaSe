package studing2;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Test1{
	   public static void main(String[] args) {
		   Collection<String> coll = new ArrayList<String>();
		   coll.add("hello");
		   coll.add("world");
		   Iterator<String> it = coll.iterator();
		   while(it.hasNext()){
			   String s = it.next();
			   System.out.println(s);
			   
	        }
	    }
	}

