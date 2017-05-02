package com.smriti.alogorithms.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution{
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(-6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        deleteNum(nums);

    }
    public static void deleteNum(List<Integer> nums){
        Iterator<Integer> itr = nums.listIterator();
        while(itr.hasNext()){
            if(itr.next()%2!=0){
                itr.remove();
            }
        }

        for(Integer s: nums){
            System.out.println(s);
        }
    }
}