public class LinkedList {

	public Node head;

	public LinkedList(){
	    head = new Node("head");
	}

	public void appendToEnd(Node node){
			//determine what place in the link list this node will be added
			//current node is set to the beginning of the list
			Node current = head;

			//check to see if the next node is null or not
			while(current.next != null){
				current = current.next;
			}

			//if current.next is null then we want the node that was passed
			current.next = node;

	}

		public boolean isCyclic(){
			Node slow = head;
			Node fast = head;

			while(slow.next != null && fast.next != null){
						slow = slow.next;
						fast = fast.next.next;

						//if slow node points to the fast node then there loop
						if(slow == fast){
							return true;
						}
					}
			return false;
		}

}
