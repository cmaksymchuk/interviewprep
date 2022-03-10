package com.maksymchuk.shopify.space;

import java.util.Scanner;

public class SpaceShipRunner {
	
	
	public static void main(String[] args) {
		SpaceShipApp app = new SpaceShipApp();

        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        app.init();
        boolean keepGoing = true;
        while (keepGoing)
        {
        	String input = in.nextLine();
        	if ("W".equals(input))
        	{
        		app.increase();
        	}
        	else if ("S".equals(input))
        	{
        		app.decrease();
        	}
        	else if ("A".equals(input))
        	{
        		app.left();
        	}
        	else if ("D".equals(input))
        	{
        		app.right();
        	}
        	app.checkCoords();
        }       
        in.close();
	}

}
