package com.smriti.alogorithms;

public class Equilibrium {
	
	
        
        public int solution(int[] A,int n) 
        {
            
            int equilibrium = -1;
            // base case
            
            if (A == null)
            {
                throw new NullPointerException("The input is null");
            }
            else if (A.length == 0)
            {
                throw new NullPointerException("No elements in array A, it is an empty array");
            }
            //Throwing null pointer exceptions if array is null or no elements are present in the array
            else
            {
                
                double leftSum = 0;
                double rightsum = 0;
                for (int i = 0; i < A.length; i++)
                {
                    rightsum += A[i];
                }

              
                for (int i = 0; i < A.length; i++)
                {
                    double temp = rightsum - A[i];
                    if (leftSum == temp)
                    {
                       
                        equilibrium = i;
                        break;
                    }
                    else
                    {
                       
                        leftSum += A[i];
                        rightsum = temp;
                    }
                }
            }

           System.out.println("equilibrium is "+equilibrium);
            return equilibrium;
        }
        
        public static void main(String []a){
        	/*int [] arr ={2,3,4};
        	solution( arr ,1);*/
        }
    

}
