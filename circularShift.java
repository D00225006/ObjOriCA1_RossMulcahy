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
        int shift = 2;
        circularShiftRight(numbers, shift);
    }
    
    public void circularShiftRight( int[] array, int n)
    {
        if(n > array.length || n < 0)
        {
            System.out.println("Invalid shift value.");
        }
        else
        {
            for(int i = 1; i < array.length; i++)
        {
            int swapper = array[0];
            array[0] = array[i];
            array[i] = swapper;
        }
        System.out.println(array.toString());
        }
    }
}
