import java.io.*;
import java.util.*;

public class Code {
    public static int sumFactors(int num){
        int f_sum = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                f_sum += i;
            }
        }
        return f_sum;
    }
	public static void main(String[] args) {
		System.out.println(sumFactors(286));
	}
}