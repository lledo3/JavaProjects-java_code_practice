import java.io.*;
import java.util.*;

//write a method that remove duplicate values from a string

class RemoveDuplicateValues {
	public static void main(String[] args) {
		
		String words = "door coffee floor dog dinosaur " +
		"coffee car car money floor";
		
		String wordsArray [] = words.split(" ");
		
		HashSet<String> hs = new HashSet<String>();
		words = "";
		for(String x : wordsArray){
			if(hs.add(x) == true){
				words += x + " ";
			}
		}
		System.out.println(words);
	}
}