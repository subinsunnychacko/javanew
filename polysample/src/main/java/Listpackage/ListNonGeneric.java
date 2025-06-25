package Listpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListNonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List s = new ArrayList();
		s.add(10);
		s.add("Java");
		System.out.println(s);
		s.set(1,"is");
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains("mango"));
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
