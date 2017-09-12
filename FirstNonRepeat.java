import java.io.*;
import java.util.*;

//Find the first non-repeat character in a string

class FirstNonRepeat {
	public static void main(String[] args) {
		
		String content = "AABCCDE";
		String contentArray [] = content.split("");
		
		int count = 0;
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(int i = 0; i < contentArray.length; i++){
			String currentLetter = contentArray[i];
			if(!hm.containsKey(currentLetter)){
				hm.put(currentLetter, 1);
				count = 1;
			}else{
				count += 1;
				hm.put(currentLetter, count);
			}
		}
		System.out.println(hm);
		
		for(int i = 0; i < contentArray.length; i++){
			String x = contentArray[i];
			if(hm.get(x) == 1){
				System.out.println(x);
				break;
			}
		}
	}
}