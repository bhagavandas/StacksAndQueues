package com.bl.Stacks;

public class INode {
	static int key;
	INode next;
	INode head;
	INode tail;
	/**
	 * @param key
	 */
	public INode(int key) {
		this.key = key;
	}
	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}
	/**
	 * @return the next
	 */
	public INode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(INode next) {
		this.next = next;
	}
}
