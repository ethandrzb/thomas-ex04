/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ethan Thomas
 */

import java.util.Scanner;

// <INSERT PSEUDOCODE SOLUTION HERE>

public class Solution04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();

        System.out.print("Enter a verb: ");
        String verb = sc.nextLine();

        System.out.print("Enter a adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter a adverb: ");
        String adverb = sc.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!%n", verb, adjective, noun, adverb);

        System.exit(0);
    }
}
