package com.smriti.alogorithms;

public class Palindrome {

	public static void main(String[] args) {
		String S1 = "Sumit";
		String S2 = "SumuS";
		String S3 = "ABCDEFGHGFEDCBA";
		String S4 = "Jain niaJ";
		String S5 = "JasasddfwfcsJ";
		
		System.out.println("Is " + S1 + " Palindrome ??? :"
				+ isPalindrome(S1));
		System.out.println("Is " + S2 + " Palindrome ??? :"
				+ isPalindrome(S2));
		System.out.println("Is " + S3 + " Palindrome ??? :"
				+ isPalindrome(S3));
		System.out.println("Is " + S4 + " Palindrome ??? :"
				+ isPalindrome(S4));
		System.out.println("Is " + S5 + " Palindrome ??? :"
				+ isPalindrome(S5));

	}
	
	public  static boolean isPalindrome(String str){
		
		StringBuilder back=new StringBuilder();
		for(int i=str.length()-1; i>=0 ; i--){
			back.append(str.charAt(i));
			
		}
		
		
		if(back.toString().equals(str))
			return true;
		else
			return false;
	}

}
