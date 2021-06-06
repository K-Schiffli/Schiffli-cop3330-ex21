/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        int monthNum = getMonthNum();
        String monthName = findMonth(monthNum);
        printOutput(monthName);
    }
    public static int getMonthNum() {
        System.out.println("Please enter the number of the month: ");
        String input = in.nextLine();

        Boolean validFlag = false;
        while (!validFlag)
        {
            try {
                Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid month: ");
                input = in.nextLine();
            }
            if(Integer.parseInt(input) < 1 || Integer.parseInt(input) > 12) {
                System.out.println("Please enter a valid month: ");
                input = in.nextLine();
                try {
                    Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid month: ");
                    input = in.nextLine();
                }
            }
            else validFlag = true;
        }
        return Integer.parseInt(input);
    }

    public static String findMonth(int monthNum)
    {
        switch (monthNum)
        {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "SELECTION ERROR";
    }

    public static void printOutput(String month)
    {
        System.out.printf("The name of the month is %s.", month);
    }
}
