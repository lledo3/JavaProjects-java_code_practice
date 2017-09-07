import java.io.*;
import java.util.*;

//write a method that returns the count of unique string values passed into a method

public class UnqiueStringValues {
	public static void main(String[] args) {
		System.out.println(count("A");
	}
	
	static HashMap<String, Integer> hm = new HashMap<String, Integer>();
	static int count = 0;
	
	public static int count(String myLetter){
	    if(hm.get(myLetter) == null){
	        hm.put(myLetter, 1);
	        count = 1;
	    }else{
	        count = count + 1;
	        hm.put(myLetter, count);
	    }
	    return hm.get(myLetter);
	}
}