package com.maksymchuk.binarytree;

public class BinarIntNode {
	int value;
	BinarIntNode left;
	BinarIntNode right;
	
	
	public BinarIntNode(int value) {
		this.value = value;	
	}
	
	public String toString() {
        StringBuilder buffer = new StringBuilder(50);
        print(buffer, "", "");
        return buffer.toString();
    }
	
    private void print(StringBuilder buffer, String prefix, String childrenPrefix) {
        buffer.append(prefix);
        buffer.append(value);
        buffer.append('\n');
        if (left != null)
        {
            left.print(buffer, childrenPrefix + "|-l ", childrenPrefix + "|   ");
        }
        if (right != null)
        {
            right.print(buffer, childrenPrefix + "|-r ", childrenPrefix + "|   ");        
        }
    }

}
