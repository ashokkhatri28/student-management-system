package net.javaguides.sms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Testing {
	public static void main(String args[]){
		//HashSet h=new HashSet();
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"Boot");
		hm.put(2,"Boot2");
		hm.put(3,"Boot3");
		
		//Iterator itr=h.iterate();
		Iterator itr=hm.iterator();
		System.out.println(h);
		while(itr.hasNext()){
			;
			//String s=(String) itr.next();
			System.out.println(itr.next());
			}
		
		}
}
