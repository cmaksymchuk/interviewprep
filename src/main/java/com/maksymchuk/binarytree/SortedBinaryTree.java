package com.maksymchuk.binarytree;

public class SortedBinaryTree {

	BinarIntNode root;

	public void add(int value) {
		insert(root, value);
	}

	public void print() {
		System.out.println(root.toString());
	}

	public void insert(BinarIntNode node, int value) {
		if (root == null)
		{
			root = new BinarIntNode(value);
		}
		else if (value < node.value) {
			if (node.left != null) {
				insert(node.left, value);
			} else {
				System.out.println(" Inserted " + value + " to left of " + node.value);
				node.left = new BinarIntNode(value);
			}
		} else if (value > node.value) {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				System.out.println("  Inserted " + value + " to right of " + node.value);
				node.right = new BinarIntNode(value);
			}
		}
	}


}
