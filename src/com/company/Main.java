package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Podaj współrzędne prawego górnego rogu prostokąta (np: 1,2): ");
	String coordinates = in.nextLine();
	Scanner out = new Scanner(coordinates).useDelimiter("\\u002C");
	int x = out.nextInt();
	int y = out.nextInt();
	System.out.println("Podaj długości boków prostokąta (np: 3x4): ");
	String dimensions = in.nextLine();
	Scanner	out2 = new Scanner(dimensions).useDelimiter("x");
	int a = out2.nextInt();
	int b = out2.nextInt();
	System.out.println("Podaj znak wypełnienia prostokąta:");
	String fill = in.nextLine();
	for(int i = 1; i < y; i++){
		System.out.println();
	}
	for(int i = 0; i < b; i++){
		for(int j = 0; j < x; j++){
			System.out.print(" ");
		}
		for(int k = 0; k < a; k++){
			System.out.print(fill);
		}
		System.out.println();
	}

    }
}
