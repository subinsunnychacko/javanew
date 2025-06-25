package Listpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List s = new ArrayList();
		s.add(10);
		s.add("Mango");
		s.add("Grape");
		s.add("Banana");
		s.add(20);
		s.add(30);
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		List<String> s1=new ArrayList<String>();
		s1.add("Java");
		s1.add("Python");
		s1.add("C++");
		System.out.println("String elements: " +s1);
		Iterator it1=s1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		System.out.println("set Elements");
		System.out.println("------");
		Set<String>s2=new HashSet<String>();
		s2.add("Black");
		s2.add("blue");
		s2.add("red");
		Iterator it3=s2.iterator();
		while(it3.hasNext())
		{
			System.out.println(it3.next());
		}
		System.out.println("Non generic set Elements");
		System.out.println("------");
		Set s3=new HashSet();
		s3.add("Black");
		s3.add("blue");
		s3.add("red");
		Iterator it4=s3.iterator();
		while(it4.hasNext())
		{
			System.out.println(it4.next());
		}
		
		
		
		
		
		

	}

}
