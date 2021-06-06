/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Calendar;
import java.util.Scanner;

public class APP {


    public static void main(String[] args) {
        final int legalDriveAge = 16;
        System.out.println("What is your age?");
        Scanner sc = new Scanner(System.in);
        String AgeString = sc.nextLine();

        int AgeInt = Integer.parseInt(AgeString);

        final boolean LegalToDrive = AgeInt >= legalDriveAge;
        final String YesLegalDrive = "You are old enough to legally drive.";
        final String IllegalDrive = "You are not old enough to legally drive.";
        String messageToPrint = (LegalToDrive) ? YesLegalDrive : IllegalDrive;
        System.out.println(messageToPrint);



    }
}
