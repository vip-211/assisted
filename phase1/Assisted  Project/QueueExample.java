package DataStructuresArraysList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample 
{
public static void main(String[] args) 
{
			Queue<String> q= new LinkedList<>();
        	q.add("Kolkata");
        		q.add("Patna");
        		q.add("Delhi");
        		q.add("Gurgaon");
        		q.add("Noida");
        		System.out.println("Queue is : " + q);
        		System.out.println("Head of Queue : " + q.peek());
        		q.remove();
        		System.out.println("After removing Head of Queue : " + q);
        		System.out.println("Size of Queue : " + q.size());
    	}
}
