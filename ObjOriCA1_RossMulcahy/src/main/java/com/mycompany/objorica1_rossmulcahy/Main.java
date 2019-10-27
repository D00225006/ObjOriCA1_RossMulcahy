package com.mycompany.objorica1_rossmulcahy;

import java.util.Scanner;
/**
 * @author Rossm
 */
public class Main 
{
    private static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        boolean quit = false;
        int choice = 0;
        while(quit == false)
        {
            System.out.println("Enter your choice(1-6):");
            choice = keyboard.nextInt();
            keyboard.nextLine();//nextInt is broken without this?
            
            switch(choice)
            {
                case 1:
                    printInstructions();
                    break;
                case 2:
                    question2();
                    break;
                case 3:
                    question3();
                    break;
                case 4:
                    question4();
                case 5:
                    question5();
                case 6:
                    quit = true;
                    break;
            }
        }
        
    }
    
    public static void printInstructions()
    {
        System.out.println("\nPress");
        System.out.println("\t 1 - To Print Choices.");
        System.out.println("\t 2 - To Access Question 2.");
        System.out.println("\t 3 - To Access Question 3.");
        System.out.println("\t 4 - To Access Question 4.");
        System.out.println("\t 5 - To Quit.");
    }
//----------------------------------------------  
    
    public static void question2()
    {
        Matrix.question2();
    }
//----------------------------------------------  
    public static void question3()
    {
        Index.question3();
    }
//----------------------------------------------     
    public static void question4()
    {
        Shift.question4();
    }
//----------------------------------------------    
    public static void question5()
    {
        Quiz.question5();
    }
}
