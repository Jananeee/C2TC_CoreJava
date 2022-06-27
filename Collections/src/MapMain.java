import java.util.SortedMap;
import java.util.TreeMap;
class MapMain
{  
 	public static void main(String args[])
 	{  
 SortedMap<Integer,String> st=new TreeMap<Integer,String>();  
  		st.put(3,"three");  
  		st.put(2,null);  
  		st.put(1,"one");
  		st.put(4,"four");
  		st.put(6,"null");
  		st.put(null,"five");
  		st.put(7,null);
  		System.out.println(st);
 	}  
} 

