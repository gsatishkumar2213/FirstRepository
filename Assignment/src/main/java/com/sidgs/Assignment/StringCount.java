package com.sidgs.Assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;


public class StringCount {
	String input = "";

	public static void main(String[] args) {
		if (args[0].equals("-C") || args[0].equals("-c")) {
			String in = "";
			for (int i = 1; i < args.length; i++) {
				in = in + args[i] + " ";
			}
			StringCount obj = new StringCount();
			obj.fromConsole(args, in);
		} else if (args[0].equals("-F") || (args[0].equals("-f"))) {
			try {
				Scanner sc = new Scanner(new File("test.txt"));
				String line = "";
				while (sc.hasNext()) {
					line = sc.nextLine();
				}
				
				StringCount obj1 = new StringCount();
				obj1.fromConsole(args, line);
				System.out.println(line);
			} catch (IOException e) {
				e.printStackTrace();
			}
			

		}
	}

	public void fromConsole(String[] args, String StringCount) {

		input = StringCount.toLowerCase();
		System.out.println("Your input is " + input);
		input = input.replaceAll("\\W", " ");
		input = input.replaceAll("  ", " ");
		String[] words = input.split(" ");
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(words));
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s: ", list.get(i));
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j)))
					count++;
				if (list.get(i).equals(list.get(j)) && count > 1)
					list.remove(j);
			}
			System.out.printf("%d\n", count);
			count = 0;
		}

		System.out.println("List of total number of distinct Words " + list.size());
		System.out.println("list of total number of words  " + words.length);
	}

}
