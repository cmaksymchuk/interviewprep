package com.maksymchuk.prep;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HouseRobberTest {

	HouseRobber houseRobber = new HouseRobber();

	@Test
	void test1() {
		assertEquals(4, houseRobber.rob(new int[] {1,2,3,1}));
	}

	
	@Test
	void test2() {
		assertEquals(12, houseRobber.rob(new int[] {2,7,9,3,1}));
	}

}
