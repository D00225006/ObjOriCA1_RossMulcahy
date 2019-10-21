package com.mycompany.objorica1_rossmulcahy;

import java.util.Scanner;
import java.util.Random;
/**
 * @author Rossm
 */
public class matrix 
{
    private static Scanner keyboard = new Scanner(System.in);
    
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
    
    public static void printMatrix(int[][] matrix, int row, int col)//Question 2: A
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
}
