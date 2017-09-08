import java.io.*;
import java.util.*;

//how to determine if linked list is a loop
//Acyclic means no loop
//Cyclic means a loop

public class LinkedListLoop {
	public static void main(String[] args) {

		LinkedList myList = new LinkedList();
		LinkedList myList2 = new LinkedList();

		myList.appendToEnd(new Node("A"));
		myList.appendToEnd(new Node("B"));
		myList.appendToEnd(new Node("C"));
		myList.appendToEnd(new Node("D"));
		myList.appendToEnd(new Node("E"));

		//A --> B --> C --> D --> D --> E

		Node cycle = new Node("C");
		myList2.appendToEnd(new Node("A"));
		myList2.appendToEnd(new Node("B"));
		myList2.appendToEnd(cycle);
		myList2.appendToEnd(new Node("D"));
		myList2.appendToEnd(new Node("E"));
		myList2.appendToEnd(cycle);

		//A --> B --> C --> D --> E --> C

		System.out.println(myList.isCyclic());
		System.out.println(myList2.isCyclic());

	}
}
