package com.mycompany.darrays_viewingpopulating;

import java.util.Scanner;

public class App 
{

    public static void main(String[] args) 
    {
        /* 
        You are supposed to store the attendance of students of 3 grades.
        Grade 9, 10 and 11. There are total of 3 grades and 5 days of records
        that you need to enter in the array. The array holds the total number of 
        students present each day of the week. */ 
        int[][] attendance = {
            {25, 27, 26, 28, 29},  
            {22, 24, 23, 25, 26},
            {20, 21, 22, 23, 24}  
        };
        /* Lets see how the .length method works on arrays */
        
        /*1D array showing attendance of students in just 1 grade over the week*/
        int[] totalStudents = {25, 27, 26, 28, 29};
        
        // In 1D arrays .length returns the total length of the array (total elements) 
        System.out.println("Total days attendace was recorded for: " + totalStudents.length);
       
        // In 2D arrays .length returns the total rows in the 2D array
        System.out.println("Total number of grades tracked for attendance: " + attendance.length);
        
        /* Print the number of days for which the attendance was recorded for all 3 grades*/
        for (int i = 0; i < attendance.length; i++) //loops over the first row and gets the length of the array (total rows)
        {
            //loop iterates over each element in the row(i) and .length gets the total amount of elements in the current row being printed
            System.out.println("Attendance has been recorded for " + attendance[i].length + " days.");
        }
        System.out.println();
        
        /* Lets see how we can view 2D arrays elements 
        Outter for loop iterates over each row (grade) */
        for (int i = 0; i < attendance.length;)
        {    
            System.out.print("Grade: " + (i+9) + " |");
            
            // Inner for loop iterates over each element in the row (i) .length gets the total elements in the row
            for (int j = 0; j < attendance[i].length;) 
            {
                System.out.print("Day " + (j+1) + " attendance: " + attendance[i][j] + " |");//print out the element at this location
                j++; //Go to the next element in the same row being printed
            }
            System.out.println(); // Move to next line after each class
            i++; //go to the next row 
        }
        /*
        Activity: Weekly Sales Tracking for Stores

        1. Declare a 2D integer array named weeklySales to hold sales for 4 stores and 7 days.

        2. Populate the array manually with example data (choose any numbers).

        3. Sample data: 
            Store 1 data: 10, 12, 15, 20, 18, 22, 25  
            Store 2 data: 8, 14, 13, 19, 17, 21, 20   
            Store 3 data: 9, 11, 12, 18, 20, 23, 24
            Store 4 data: 7, 10, 14, 16, 19, 21, 22
        
        3. - Print the number of days recorded for each store.
           - Print the sales for each store, day by day (print out which day the sales are being printed out for and which store)
        */
          int[][] weeklySales = {
            {10, 12, 15, 20, 18, 22, 25},  // Store 1
            {8, 14, 13, 19, 17, 21, 20},   // Store 2
            {9, 11, 12, 18, 20, 23, 24},   // Store 3
            {7, 10, 14, 16, 19, 21, 22}    // Store 4
        };
          
        // 2. Print the number of days recorded for each store
        for (int i = 0; i < weeklySales.length; i++)
        {
            System.out.println("Store " + (i + 1) + " has sales recorded for " + weeklySales[i].length + " days.");
        }
        System.out.println();
        
        // 3. Print sales for each store, day by day
        for (int i = 0; i < weeklySales.length; i++)
        {
            System.out.print("Sales for Store " + (i + 1) + ": ");
            for (int j = 0; j < weeklySales[i].length; j++)
            {
                System.out.print("Day " + (j + 1) + ": " + weeklySales[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
//        int [][] attendance2 = new int[3][5];
//        Scanner scanner = new Scanner(System.in);
//        
//        for (int i = 0; i < attendance2.length;) 
//        {    
//            System.out.println("Enter attendance for grade: " + (i+9));
//            // Iterate over each row (grade)
//            for (int j = 0; j < attendance2[i].length;) 
//            {
//                System.out.print("Enter the attendance for day " + (j+1) + ": ");
//                 attendance2[i][j] = scanner.nextInt();
//                j++;
//            }
//            System.out.println(); // Move to next line after each class
//            i++;
//        }
//        
//        
        /*Look at textbook example for more work for students*/
        
    }
}
