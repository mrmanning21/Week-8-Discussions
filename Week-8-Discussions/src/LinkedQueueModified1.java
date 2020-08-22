// This class implements a queue using a linked list
// It requires the LinkedNode class to be defined
public class LinkedQueueModified1 {

	LinkedNode front;
	LinkedNode rear;
	int count;
	
	LinkedQueueModified1() {
		front = rear = null;
		count = 0;
	}
	
	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear!=null)			
			rear.next = newNode;
		else 
			front = newNode;
		rear = newNode;
		count++;
	}
	
	int dequeue() {
		if (front==null) {
			return -1;
		}
		
		if (front!=rear) {
			int x = front.x;
			front = front.next;		
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count --;
			return x;
		}
	}
	
	int first() {
		return front.x;
	}
	
	boolean isEmpty() {
		return count==0;
	}
	
	int size() {
		return count;
	}
	
public void removeMiddle () {

	int length = 0;
	LinkedNode newNode = front;
	LinkedNode mid = front;
	LinkedNode mid_previous = mid;
    int position;
		//loop for modified node.
		while (newNode!= null) {
		length++;

			if (length % 2 == 0) {
			    mid_previous = mid;
				mid = mid.next;
			}

		newNode = newNode.next;
		}

		if (length % 2 == 0) {
			mid = mid_previous;
			position = length/2;

		}
		else
		position = length/2 +1;

		System.out.println("The middle   number in the array is: " + mid.x);
        
        //Now removing the element
     //   System.out.println("The value of position is  " + position);
        newNode = front;
        length = 0;
        if(position == 1)
        {
            front = front.next;
        }
        else{
        while (newNode != null) {
		length++;
            
			if (length == position - 1) {
			   // System.out.println("The element here is " + newNode.x);
			    newNode.next = newNode.next.next;
			    break;
			}
    
		newNode = newNode.next;
		}
        }
        System.out.println("Elements after removing the middle element are ");
        newNode = front;
        length = 0;
        while (newNode != null) {
		length++;
            System.out.println("Element is " + newNode.x);
			

		newNode = newNode.next;
		}
		}


}

