package com.testing;

import java.util.Arrays;

import com.csegeek.algo.arraystrings.ArrayStrings;

public class main {
	public static void main(String args[]){
        System.out.println("java main");
        int[] arr = {1,4,5,6,7,8,6};
        /*System.out.println("hello java"+Arrays.toString(arr));
        UserAbstract.maximize( arr,2);*/
      ArrayStrings array1 = new ArrayStrings();
      //array1.reverseArray(new int[]{1,4,5,6,7,8,6});
      //array1.sort01(new int[]{0,1,0,1,0,1,0,1,1,1,0,0 });
      array1.sort012(new int[]{1,2,0,1,0,1,2,0,2,0,0,2,1,0,1,0 });
    }
}
