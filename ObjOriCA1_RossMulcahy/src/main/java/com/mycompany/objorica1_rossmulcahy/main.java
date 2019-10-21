package com.mycompany.objorica1_rossmulcahy;

import java.util.Random;
import java.util.Scanner;
/**
 * @author Rossm
 */
public class main 
{
    private static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        boolean quit = false;
        int choice = 0;
        while(quit == false)
        {
            System.out.println("Enter your choice(1-4):");
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
                    quit = true;
                    break;
            }
        }
        
    }
    
    public static void printInstructions()
    {
        System.out.println("\nPress");
        System.out.println("\t 0 - To Print Choices.");
        System.out.println("\t 1 - To Access Question 2.");
        System.out.println("\t 2 - To Access Question 3.");
        System.out.println("\t 3 - To Quit.");
    }
    
    public static void question2()
    {
        int col;
        int row;
        System.out.println("Please enter the number of rows in your Matrix:");
        row = keyboard.nextInt();
        keyboard.nextLine();
        
        
        System.out.println("Please enter the number of coloumns in your Matrix:");
        col = keyboard.nextInt();
        keyboard.nextLine();
        
        int[][] matrixA = createMatrix(row, col);
        printMatrix(matrixA, row, col);
        System.out.println("---");
        int[][] matrixB = createMatrix(row, col);
        printMatrix(matrixB, row, col);
        System.out.println("---");
        int[][] matrixSum = addMatrices(matrixA, matrixB, row, col);
        printMatrix(matrixSum, row, col);
    }
    
    public static int[][] createMatrix(int row, int col)//Causing error: "Failed to execute goal org.codehaus.mojo:exec-maven-plugin:1.2.1:exec (default-cli) on project ObjOriCA1_RossMulcahy: Command execution failed. Process exited with an error: 1 (Exit value: 1) -> [Help 1]"
    { 
        Random random = new Random();
        int[][] matrix = new int[row][col];
        
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                matrix[i][j] = random.nextInt(5);
            }
        } 
        return matrix;
    }
    
    public static int[][] addMatrices(int[][] A, int[][] B, int row, int col)
    {
        int[][] matrixSum = new int[row][col];
        for(int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                matrixSum[i][j] = A[i][j] + B[i][j];
            }
        }
        return matrixSum;
    }
    
    public static void printMatrix(int[][] matrix, int row, int col)
    {
        for(int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    public static void question3()
    {
        int[] arrayToIndex = {1,2,3,5,6};
        int[] indexArray = new int[]{};
        indexArray = indexOfMinAndMax(arrayToIndex);
        System.out.println("The min value of the original array occured at " + indexArray[0] + ", and the max value occured at " + indexArray[1] + '.');
    }
    
    public static int[] indexOfMinAndMax(int[] array)//"Return the results as a pair of values stored in an array, and these values should be used to display the min and max values from the original array." Find the min/max, to find their index, to find the min/max?
    {
        int min = array[0];
        int max = array[0];
        int indexOfMin = 0;
        int indexOfMax = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < min)
            {
                indexOfMin = i;
            }
            
            if(array[i] > max)
            {
                indexOfMax = i;
            }
        }
    int[] indexArray = new int[] {indexOfMin, indexOfMax};
    return indexArray;   
    }
}
