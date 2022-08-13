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

}
