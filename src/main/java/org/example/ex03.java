/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        // prompt for quote and scan in
        System.out.print("What is the quote? ");
        Scanner input1 = new Scanner(System.in);
        String quote = input1.nextLine();

        // prompt for who said it
        System.out.print("Who said it? ");
        Scanner input2 = new Scanner(System.in);
        String person = input2.nextLine();

        // print output using concatenation
        System.out.println(person + " says, \"" + quote + "\"");
    }
}
