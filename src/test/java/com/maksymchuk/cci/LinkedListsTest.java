package com.maksymchuk.cci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import com.maksymchuk.binarytree.SingleLinkedList;
import com.maksymchuk.binarytree.SllNode;

public class LinkedListsTest {

	LinkedLists ll = new LinkedLists();
	
	
	@Test
	public void testRemoveDupes1()
	{
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.addAll(Arrays.asList("a","a","b","c","d","c"));

		
		ll.removeDupes1(linkedList);
		
		for (String s : linkedList)
		{
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	@Test
	public void testRemoveDupes2()
	{
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.addAll(Arrays.asList("a","a","b","c","d","c"));

		
		ll.removeDupes2(linkedList);
		for (String s : linkedList)
		{
			System.out.print(s + " ");
		}
		System.out.println();

	}
	
	@Test
	public void singlLinkedList()
	{
		SingleLinkedList ll = new SingleLinkedList();
		for (int i = 0; i < 10; i++)
		{
			ll.add(i);
		}

		
		while (!ll.isEmpty())
		{
			SllNode node = ll.remove();
			System.out.print(node.getData() + " ");
		}
	}
	
	@Test
	public void sumLinkedListTest()
	{
		LinkedLists ll = new LinkedLists();
		
		SingleLinkedList l1 = new SingleLinkedList();
		l1.add(7,1,6);
		SingleLinkedList l2 = new SingleLinkedList();
		l2.add(5,9,2);		

		assertEquals(912, ll.sumLists(l1, l2));
	}
}
