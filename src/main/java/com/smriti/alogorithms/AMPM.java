package com.smriti.alogorithms;

import java.util.Scanner;

public class AMPM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		
		String AMPM = time.substring(8, 10);
		
		if (AMPM.equals("AM")) {
			
			if (time.substring(0, 2).equals("12")) {
				StringBuilder time1 = new StringBuilder(time.substring(0, 8));
				time1 = time1.replace(0, 2, "00");
				
				System.out.println(time1);
			}
			else{
			time = time.substring(0, 8);
			System.out.println(time);
			}
		}
		if (AMPM.equals("PM")) {
			if (time.substring(0, 2).equals("12")) {
				time = time.substring(0, 8);
				System.out.println(time);
			} else {
				time = time.substring(0, 8);
				String[] arr = time.split(":");
				Integer t = Integer.parseInt(arr[0]);
				System.out.println(t);
				t = t + 12;
				System.out.println(t);
				arr[0] = t.toString();
				int i = 0;
				String str1="";
				for (String str : arr) {
					str1 = str1 + str+":";
					i++;
					time = str1;
				}
				time=time.substring(0,8);
				System.out.println(time);
			}
		}
	}

}
