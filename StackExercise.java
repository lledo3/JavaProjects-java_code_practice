import java.io.*;
import java.util.*;

public class Code {
	public static void main(String[] args) {
		Stack obj = new Stack();
		obj.push(new Integer(3));
		obj.push(new Integer(2));
		System.out.println(obj);
		obj.pop();
		obj.push(new Integer(5));
		System.out.println(obj);
	}
}