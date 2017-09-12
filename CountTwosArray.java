import java.io.*;
import java.util.*;

//write a method that counts the number of 2s in an array

class CountTwosArray {
	public static void main(String[] args) {
		
		int myArray[] = {2,1,4,5,332,22,96,322,222,52,2};
		
		int number2Count = 0;
		
		for(int i = 0; i < myArray.length; i++){
			String x = String.valueOf(myArray[i]);
			
			for(char c : x.toCharArray()){
				if(c == '2'){
					number2Count += 1;
				}
			}
		}
		System.out.println(number2Count);
	}
}