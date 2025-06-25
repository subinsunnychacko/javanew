package Listpackage;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> s=new HashSet<String>();
		s.add("Football");
		s.add("Cricket");
		s.add("Tennis");
		s.add("Hockey");
		System.out.println(s);
		System.out.println(s.contains("Football"));
		System.out.println(s.remove("Cricket"));
		System.out.println(s);
		
		Set <String> s1=new HashSet<String>();
		s1.add("Ozil");
		s1.add("Ode");
		s1.add("Saka");
		s1.add("Football");
		s1.add("Cricket");
		System.out.println("Secondary set" + s1);
		s.addAll(s1);
		System.out.println("adding set 1 and set 2" + s);
		System.out.println(s.containsAll(s1));
		s.removeAll(s1);
		System.out.println("After removing s1 elements" + s);
		
		

	}

}
