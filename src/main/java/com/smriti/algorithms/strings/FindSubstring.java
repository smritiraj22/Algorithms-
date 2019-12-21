package com.smriti.algorithms.strings;

public class FindSubstring {
    public static void main(String [] args){
        String string1 = "abcdef";
        String string2 = "cde";

        boolean found;
        int size =0;
        outer: for(int i =0; i< string1.length();i++){
            for(int j=0; j<string2.length();j++){
                if(string1.charAt(i)==string2.charAt(j)){
                    i++;
                    size++;
                    if(size ==string2.length()) {
                        System.out.println("found");
                        break outer;
                    }
                }
            }
        }

    }

}
