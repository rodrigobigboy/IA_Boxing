package com.company;
import jdk.swing.interop.SwingInterOpUtils;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Boxer B1 = new Boxer ("Alvarez", 100, 100, 4, 4, 4,4,
                3, 5, 3,4, 3,
                4, 4, 5, 2, 1,
                3, 5, 6, 4,4,
                4,2,5, 2,4,
                3,2,5,6,2,
                4,5,3, 2,3,
                4,5,3,44, 4,
                4,42,1,7,6,
                75,7,5,5,5);
        Boxer B2 = new Boxer ("May", 90, 100, 5, 6, 6,3,
                2, 5, 4, 2,5,
                6,5,4,3,4,
                5,6,7,7,6,
                5,4,3,2,3,
                4,5,6,5,6,
                5,7,5,6,5,
                6,5,6,5,5,
                6,5,6, 5,6565,
                6,5,5,65,5);


        for (Boxer boxer : Arrays.asList(B1, B2)) {
            System.out.println(boxer.toString());
        }

        B1.getH()

	/*
	Point system
	    - Clean Punches Landed
	    - Successful Blocks
	Rounds
	    - 8
	    - 10
	    - 12
	Characters
	    - May
	    - Tyson
	    - Fury
	    - Alvarez


        Boxer B3 = new Boxer ("Tyson", 110, 100, 4, 5, 5, 3);
        Boxer B4 = new Boxer ("Fury", 105, 100, 5, 2, 4, 4);
        Boxer B5 = new Boxer ("Oscar", 95, 100, 3, 3,4 , 4);
        Boxer B6 = new Boxer ("Tank", 100, 100, 4, 24, 5,5 );
	*/
    }
}
