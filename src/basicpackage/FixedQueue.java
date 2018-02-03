package basicpackage;


//Implement a fixed-capacity queue that uses a fixed-sized array for storage.
//The queue should have one method to add a new element and another that both
//removes an element and returns it.

public class FixedQueue {
	    private int queue[] = new int[20];
	    private boolean isSet[] = new boolean[20];
	    private int current = 0;
	    private int remove = 0;
	    
	    public void addQueue(int data){
	            if((!isSet[current]) && (current < 20)){
	                queue[current] = data;
	                isSet[current] = true;
	                ++current;
	            } else {
	                  System.out.println("Queue is full");
	            }
	    }
	    
	    public int removeElement(){
	        int number = queue[remove];
	        queue[remove] = 0;
	        isSet[remove] = false;
	        ++remove;
	        return number;
	    }
	    
	    
	    public void printQueue(){
	        for(int data:queue) {
	            System.out.println(data);
	        }
	    }
	    
	    public static void main(String[] args) {
	        System.out.println("Hello, world!");
	        FixedQueue pgm = new FixedQueue();
	        pgm.addQueue(5);
	        pgm.addQueue(10);
	        pgm.printQueue();
	        System.out.println("Element removed : " + pgm.removeElement());
	        System.out.println("After removal: ");
	        pgm.printQueue();
	        pgm.addQueue(20);
	        pgm.addQueue(25);
	        System.out.println("After adding: ");
	        pgm.printQueue();
	    
	    }
	}

