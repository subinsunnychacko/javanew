package Listpackage;

import java.util.HashSet;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> in=new HashSet<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		System.out.println(in);
		System.out.println(in.size());
		System.out.println(in.isEmpty());
		System.out.println(in.contains(10));
		in.remove(10);
		System.out.println(in);
		//in.clear();
		//System.out.println(in);
		
		HashSet <Integer> in1=new HashSet<Integer>();
		in1.add(150);
		in1.add(160);
		in1.add(170);
		in1.add(180);
		in1.addAll(in);
		System.out.println(in1);
		in1.removeAll(in);
		System.out.println(in1);
		System.out.println(in1.size());

	}

}
