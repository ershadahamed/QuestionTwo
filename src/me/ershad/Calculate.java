package me.ershad;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Integer [] input = new Integer[9];
		
		for(int x = 0; x < input.length; x++) {
			int i = in.nextInt();
			input[x] = i;
		}
		
		Calculate calculate = new Calculate();
		calculate.calculate(input);
		
		in.close();
	}

	public void calculate(Integer [] inputs) {
		for(int x = 0; x < inputs.length; x++) {
			int sum = 0;
			
			if(x % 2 == 0) {
				for(int y = 0; y < x; y++) {
					sum += inputs[y];
				}
			}
			
			if(sum != 0) {
				System.out.println("Line#" + (x-1) + ": " + sum);
			}
		}
	}
}
