package com.mycompany.objorica1_rossmulcahy;

/**
 *
 * @author Rossm
 */
public class circularShift 
{
    public void question4()
    {
        int[] numbers = new int[5];
        circularShiftRight(numbers);
    }
    
    public void circularShiftRight( int[] array)
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
