import java.io.*;

public class Code {
    
    public static boolean isPalidrome(String s){
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
	    String s = "knock";
		System.out.println("Is " + s + " a palindrome? " + isPalidrome(s));
	}
}