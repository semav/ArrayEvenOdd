package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {1,2,3,4,5,6,7,34,23,12,43,12,34,12,11,1,1,1,2,2,3,4,8,9,8,7,6,5,4,3,2,1};


	    int oddIndex = 0;
	    int evenIndex = array.length - 1;

	    while(oddIndex != evenIndex){
	        if(array[oddIndex] % 2 == 0){
	            oddIndex++;
            }
	        else{
	            int temp = array[oddIndex];

                array[oddIndex] = array[evenIndex];
                array[evenIndex] = temp;
                evenIndex--;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
