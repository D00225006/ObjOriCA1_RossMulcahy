package com.mycompany.objorica1_rossmulcahy;

import static com.mycompany.objorica1_rossmulcahy.Main.circularShiftRight;

/**
 *
 * @author Rossm
 */
public class CircularShift 
{
    public static void question4()
    {
        System.out.println("---");
        int[] numbers = {1,2,3,4,5};
        int shift = 1;
        circularShiftRight(numbers, shift);
    }
    
    public static void circularShiftRight( int[] array, int n)
    {
        int[] shiftedArray = new int[array.length];
        
        if(n > array.length || n < 0)
        {
            System.out.println("Invalid shift value.");
        }
        else
        {
            for(int i = 0; i < array.length; i++)
            {
                for(int j = 0; j < n; j++);
                {
                    array[j+n] = shiftedArray[j];
                }
                for(int j = 0; j+n < array.length; j++)
                {
                    array[j] = shiftedArray[j+n];
                }
            }
            
            array = shiftedArray;
        }
    }
}
