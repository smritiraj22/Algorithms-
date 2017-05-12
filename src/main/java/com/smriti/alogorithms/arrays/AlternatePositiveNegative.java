package com.smriti.alogorithms.arrays;

public class AlternatePositiveNegative {

	public static void main(String[] args) {
		int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
		int[] a = alternatePosNeg(arr);
		for (int i : a) {
			System.out.println(i);
		}

	}

	public static int[] alternatePosNeg(int[] arr) {
		int n = arr.length;
		int i = -1, temp = 0;
        for (int j = 0; j < n; j++)
        {
            if (arr[j] < 0)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        int pos = i+1, neg = 0;
 
         while (pos < n && neg < pos && arr[neg] < 0)
        {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg += 2;
        }
         return arr;
	}

}
