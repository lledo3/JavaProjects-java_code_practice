import java.io.*;
import java.util.*;

public class Code {
	public static void main(String[] args) {
		Vector obj = new Vector(4,2);
		System.out.println(obj);
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(5));
		System.out.println(obj);
		obj.removeAll(obj);
		System.out.println(obj.isEmpty());
	}
}