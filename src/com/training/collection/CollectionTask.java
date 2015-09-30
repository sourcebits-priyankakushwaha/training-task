package com.training.collection;

//import java.io.*;
import java.util.ArrayList;

public class CollectionTask {
	public int id;
	public String name;

	/**
	 * Constructor
	 * 
	 * @param a
	 * @param s
	 */
	public CollectionTask(int a, String s) {
		this.id = a;
		this.name = s;
	};

	public static void main(String[] args) {
		int i;

		for (i = 0; i < args.length; i++)
			System.out.println(args[i]);
		System.out.println("\n");
		ArrayList<CollectionTask> al = new ArrayList<CollectionTask>();

		CollectionTask obj;
		for (i = 0; i < args.length; i++) {
			obj = new CollectionTask(i, args[i]);
			al.add(obj);
		}

		for (int j = 0; j <= args.length - 1; j++) {
			System.out.println(al.get(j).name);
		}
		System.out.println("\n");
		al.remove(2);

		for (int j = 0; j <= args.length - 2; j++) {
			System.out.println(al.get(j).name);
		}
		System.out.println("\n");
		al.add(2, new CollectionTask(2, "Name"));
		for (int j = 0; j <= args.length - 2; j++) {
			System.out.println(al.get(j).name);
		}
	}
}
