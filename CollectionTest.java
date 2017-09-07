import java.io.*;
import java.util.*;

public class CollectionTest.java {
	public static void main(String[] args) {
		
		String[] colors = {"MAGENTA","RED","WHITE","BLUE","CYAN"};
		List<String> list = new ArrayList<>();
		
		for(String color : colors)
		    list.add(color);
		    
		String[] removeColors = {"RED","WHITE","BLUE"};
		List<String> removeList = new ArrayList<>();
		
		for(String color : removeColors)
		    removeList.add(color);
		    
		
	}
}