package com.maksymchuk.cci;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import com.maksymchuk.binarytree.SingleLinkedList;
import com.maksymchuk.binarytree.SllNode;

public class LinkedLists {

	public void removeDupes1(LinkedList<String> ll) {
		Set<String> hashSet = new HashSet<String>();
		Iterator<String> it = ll.iterator();

		while (it.hasNext()) {
			String next = it.next();
			if (hashSet.contains(next))
			{
				it.remove();
			}
			else {
				hashSet.add(next);
			}
		}
		
		for (String s : ll)
		{
			System.out.println(s);
		}
	}
	
	public void removeDupes2(LinkedList<String> ll) {
		Iterator<String> it = ll.iterator();
		Iterator<String> searcher = ll.iterator();
		int index = 0;
		

		while (it.hasNext()) {			
			String next = it.next();
			boolean duplicate = searchForDupeInLinkedList(index + 1, next, ll);
			if (duplicate)
			{
				it.remove();
				index--;
			}			
			index++;
		}

	}
	
	public boolean searchForDupeInLinkedList(int searchFromIndex, String searchFor, LinkedList<String> ll) 
	{
		while (searchFromIndex < ll.size())
		{
			String searchedNext = ll.get(searchFromIndex);
			if (searchedNext.equals(searchFor))
			{
				return true;
			}
			searchFromIndex++;
		}
		return false;
	}
	
	public int sumLists(SingleLinkedList l1, SingleLinkedList l2)
	{
		return getValue(l1) + getValue(l2);
	}
	
	public int getValue(SingleLinkedList l)
	{
		int times = 1;
		int sum = 0;
		SllNode node = l.getHead();
		while (node != null)
		{
			sum += node.getData() * times;
			times = times * 10;
			node = node.getNext();
		}	
		return sum;
	}

}
