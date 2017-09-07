import java.io.*;
import java.util.*;

//write a method to find the total number of combinations to climb a stair case
//base case: if n(# of stairs) <= 2 then return n
public class ClimbSteps {
	public static void main(String[] args) {
		System.out.println(calculateCombinationOfSteps2(3));
	}
	
	
	//time: O(2^n) --> exponential
	//recursive
	public static int calculateCombinationOfSteps1(int n){
	    if(n <= 2){
	        return n;
	    }else{
	        return calculateCombinationOfSteps1(n-1) + calculateCombinationOfSteps1(n -2);
	    }
	}
	
	//time: O(n)
	//non-recursive
	public static int calculateCombinationOfSteps2(int n){
	    if( n <= 2){
	        return n;
	    }
	    int first = 1;
	    int second = 2;
	    int nth = 2;
	    
	    for(int i = 3; i <= n; i++){
	        nth = first + second;
	        first = second;
	        second = nth;
	    }
	    return nth;
	}
}