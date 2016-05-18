package com.testing;

import java.util.Arrays;

public class UserAbstract {
	
	
	static int[] maximize(int[] arr, int swaps) {
        do{ 
            for( int i = 0; i < arr.length; i++){
            	System.out.println("hello i:"+i+" swaps:"+swaps+" arr:"+Arrays.toString(arr));
                for( int j = i+1; j < arr.length; j++ ){ 
                	System.out.println("hello j:"+j+" swaps:"+swaps+" arr:"+Arrays.toString(arr));
                    if( swaps > 0){
                        if( arr[i] < arr[j] ){
                            int base = arr[j];
                            int swapper = j;
                            for( int k = j+1; k < arr.length; k++ ){ 
                                if( arr[i] < k && base < arr[k]){
                                    base = arr[k];
                                    swapper = k;
                                }
                            }
                            int temp = arr[i];
                            arr[i] = base;
                            arr[swapper] = temp;    
                            swaps--;
                            
                        }
                    }else{
                        break;
                    }
                }
                
            }
        }while( swaps > 0);
        return arr;
    }
	
	 static String getAllOneMultiple(int n) {
	        String returner = "";
	        long multiplier = 7;
	        long digit = 0;
	        while( true ){
	            digit = n * multiplier;
	            if( areAllDigitsSame(digit) ){
	                returner = ""+digit;
	                break;
	            }
	            multiplier +=10;
	        }
	        return returner;
	    }

	    static boolean areAllDigitsSame( long digit ){
	        while( digit > 0 && digit/10 > 10 ){
	            long temp = digit % 10;
	            if( temp/10 < 10 ){
	                return true;    
	            }
	            if( digit/10 != temp ){
	                return false;
	            } 
	        }
	        return true;
	    }
}
