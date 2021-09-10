package com.iav;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 1;

	    switch (switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.printf("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("Value was 3, 4 or 5");
            break;
        default:
            System.out.println("Was not 1 or 2");
            break;
        }

        char character = 'C';

	    switch (character) {
        case 'A': case 'B': case 'C': case 'D': case 'E':
            System.out.println("Char was A, B, C, D, or E");
            break;
        default:
            System.out.println("Not found");
            break;
        }
    }
}
