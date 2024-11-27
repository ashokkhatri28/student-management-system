package net.javaguides.sms;

import java.util.HashMap;
import java.util.Map;

public class Testing2 {
	
	public static void main(String args[]) {
		Testing2 t=new Testing2();
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
//		for(Map.Entry<Integer, String> set:hm.entrySet()) {
//			//System.out.println("Values:"+set);
//			System.out.println(set.getKey()+" "+set.getValue());
//			
//		}
		
		hm.forEach((key,value)->{
			
			System.out.println(key+" "+value);	
		});
		
	}

}
