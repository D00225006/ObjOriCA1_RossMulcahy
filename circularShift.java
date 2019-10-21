package com.mycompany.objorica1_rossmulcahy;

import static com.mycompany.objorica1_rossmulcahy.main.circularShiftRight;

/**
 *
 * @author Rossm
 */
public class circularShift 
{
    public void question4()
    {
        int[] numbers = {1,2,3,4,5};
        int shift = 1;
        circularShiftRight(numbers, shift);
    }
    
    public void circularShiftRight( int[] array, int n)
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
                
                while(i+n < array.length)
                {
                    array[i] = shiftedArray[i+n];
                }
                while(i+n > array.length)
                {
                    for(int j = 0; j < n; j++)
                    {
                        array[i] = shiftedArray[j];
                    }
                }
            }
        }
        
        for(int i = 0; i < array.length; ++i)
        {
            System.out.print(array[i]);
        }
        System.out.println("---");
        for(int i = 0; i < array.length; ++i)
        {
            System.out.print(shiftedArray[i]);
        }
    }
}
