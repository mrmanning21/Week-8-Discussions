public class DriverModified1 {
	
	public static void main(String args []) {
		
		//Instance creation.
        LinkedQueueModified1 linkedQueue = new LinkedQueueModified1 ();
//		ArrayQ arrayQ = new ArrayQ ();
		System.out.println ("Enqueue 1,7,3,4,9,2 in linkedQueue");
			linkedQueue.enqueue (1);
			linkedQueue.enqueue (7);
			linkedQueue.enqueue (3);
			linkedQueue.enqueue (4);
			linkedQueue.enqueue (9);
			linkedQueue.enqueue (2);
			linkedQueue.removeMiddle ();
        
        
		//Dequeuing from linkedQueue.
//         System.out.println("Dequeuing elements from linkedQueue:");
//         while (!linkedQueue.isEmpty()) {
//             int element = linkedQueue.dequeue();
//             System.out.println("We have dequeued " + element);
//         }
  
// 		//ArrayQ queuing.
// 		System.out.println ("Queue up the array for 1,7,3,4,9,2.");
// 		arrayQ.enqueue (1);
// 		arrayQ.enqueue (7);
// 		arrayQ.enqueue (3);
// 		arrayQ.enqueue (4);
// 		arrayQ.enqueue (9);
// 		arrayQ.enqueue (2);

// 	    System.out.println ("Dequeuing elements from arrayQ: ");
//         while (!arrayQ.isEmpty ()) {
//             int arrayElement = arrayQ.dequeue ();
//             System.out.println ("We have dequeued "+arrayElement);
//         }
}
}
