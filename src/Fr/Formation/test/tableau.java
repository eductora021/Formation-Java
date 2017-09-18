package Fr.Formation.test;
import java.util.*;  

public class tableau {
	public static void Tableau(){
		int TableauEntier[] = {0,1,2,3,4,5,6,7,8,9};
		for(int i = 0; i < TableauEntier.length; i++) {
			System.out.println(TableauEntier[i]);
		}
	}
	public static void Dico() {
		Map<Integer,String> map=new HashMap<Integer,String>();  
		map.put(100,"Amit");  
		map.put(101,"Vijay");  
		map.put(102,"Rahul");  
		for(Map.Entry m:map.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}
	}
}
