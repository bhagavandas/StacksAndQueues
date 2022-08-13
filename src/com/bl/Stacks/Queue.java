package com.bl.Stacks;

import java.util.LinkedList;
import java.util.Stack;

public class Queue {
	 private static int front, rear, capacity; 
	    private static int queue[]; 
	   
	    public Queue(int size) { 
	        front = rear = 0; 
	        capacity = size; 
	        queue = new int[capacity]; 
	    } 
	  

		// inserting an element into the queue
	    static void enqueue(int item)  { 
	        // check if the queue is full
	        if (capacity == rear) { 
	            System.out.print("\nQueue is full\n"); 
	            return; 
	        } 
	   
	        // insert element at the rear 
	        else { 
	            queue[rear] = item; 
	            rear++; 
	        } 
	        return; 
	    }
	    
	    static void display() 
	    { 
	        int i; 
	        if (front == rear) { 
	            System.out.print("Queue is Empty\n"); 
	            return; 
	        } 
	   
	        // traverse front to rear and print elements 
	        for (i = front; i < rear; i++) { 
	            System.out.println(queue[i]); 
	        } 
	        return; 
	    }
	    
	    
	    static void dequeue()  { 
	        // check if queue is empty 
	        if (front == rear) { 
	            System.out.printf("\nQueue is empty\n"); 
	            return; 
	        } 
	   
	        // shift elements to the right by one place uptil rear 
	        else { 
	            for (int i = 0; i < rear - 1; i++) { 
	                queue[i] = queue[i + 1]; 
	            } 
	   
	       
	      // set queue[rear] to 0
	            if (rear < capacity) 
	                queue[rear] = 0; 
	   
	            // decrement rear 
	            rear--; 
	        } 
	        return; 
	    } 
	    
	    // print front of queue 
	    static void queueFront() 
	    { 
	        if (front == rear) { 
	            System.out.printf("Queue is Empty\n"); 
	            return; 
	        } 
	        System.out.printf("\nFront Element of the queue: %d", queue[front]); 
	        return; 
	    } 

}
