package com.bl.Stacks;

public class MyStack {

	private INode top;
	private int nodesCount;

	public void Stack() {
		this.top = null;
		this.nodesCount = 0;
	}

	// Utility function to add an element `x` to the stack
	public void push(int x) { 
	
		// created object for INode
		INode node = new INode(x);

		// check if stack (heap) is full. Then inserting an element would

		if (node == null) {
			System.out.println("Heap Overflow");
			return;
		}

		// set data in the allocated node
		node.key = x;

		// set the .next pointer of the new node to point to the current
		node.next = top;

		// update top pointer
		top = node;

		// increase stack's size by 1
		this.nodesCount += 1;
	}

	// Utility function to check if the stack is empty or not
	public boolean isEmpty() {
		return top == null;
	}
}
