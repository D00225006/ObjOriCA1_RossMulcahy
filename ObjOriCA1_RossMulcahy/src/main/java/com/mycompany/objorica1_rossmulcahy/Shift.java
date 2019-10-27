package com.mycompany.objorica1_rossmulcahy;

/**
 *
 * @author Rossm
 */
public class Shift 
{
    public static void question4()
    {
        System.out.println("---");
        int[] numbers = {1,2,3,4,5};
        int shift = 1;
        numbers = circularShiftRight(numbers, shift);
    }
    
    public static int[] circularShiftRight( int[] array, int n)
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
                    array[j+n] = shiftedArray[j];//Cannot find the j variable used to declare the for loop, for some reason.
                }
                for(int k = 0; k+n < array.length; k++)
                {
                    array[k] = shiftedArray[k+n];
                }
            }
            array = shiftedArray;
        }
        return array;
    }
}
