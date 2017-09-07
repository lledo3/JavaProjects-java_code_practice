import java.io.*;
import java.util.*;

public class Code {
    public static int sum_of_divisors1(int num){
        int d_sum = 1;
        for(int n = 2; n <= num; n++){
            if(num % n == 0){
                d_sum += n;
            }
        }
        return d_sum;
    }
    public static int sum_of_divisors2(int num){
        int d_sum = 1;
        int n = 2;
        while(n * n < num){
            if(num % n == 0){
                d_sum += n;
                d_sum += num/n;
            }
            n++;
        }
        if(n * n == num)
            d_sum += n;
        return d_sum;    
    }
	public static void main(String[] args) {
		int n = 28;
		int sum_d = sum_of_divisors2(n);
		if(sum_d == n){
		    System.out.println("Perfect Number");
		}else if(sum_d > n){
		    System.out.println("Abundant Number");
		}else{
		    System.out.println("Deficient Number");
		}
    }
}