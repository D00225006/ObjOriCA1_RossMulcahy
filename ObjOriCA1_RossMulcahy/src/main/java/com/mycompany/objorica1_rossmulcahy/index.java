package com.mycompany.objorica1_rossmulcahy;

/**
 * @author Rossm
 */
public class index 
{
    public static void question3()
    {
        int[] arrayToIndex = {11,2,38,54,6};
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
