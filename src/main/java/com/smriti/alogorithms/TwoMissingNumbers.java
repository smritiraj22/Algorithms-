package com.smriti.alogorithms;

public class TwoMissingNumbers {

	public static void main(String[] args) {
		int [] arrA = {10,2,3,5,7,8,9,1};
		
		int [] results = missingNumbers(arrA, 10);
		System.out.println("Missing numbers are :" + results[0] + " and " + results[1]);

	}
	
	
	public static int []  missingNumbers(int [] arrA, int range){
		int Sum=0;
		int SumN=0;
		int P=1;
		int Np=1;
		int a=0,b=0;
		
		SumN = range*(range+1)/2;
		for(int i=0;i<arrA.length;i++){
			Sum +=arrA[i];
		}
		int s= SumN-Sum;
		for(int i=0;i<arrA.length;i++){
			P *=arrA[i];
		}
		for(int i=1;i<=range;i++){
			Np *=i;
		}
		int product = Np/P;

		int diffSqr = (int)Math.sqrt(s*s-4*product); // (a-b)^2 = (a+b)^2-4ab
		a = (s+diffSqr)/2;
		b= s-a;
		int [] result = {a,b};
		return result;
	}

}
