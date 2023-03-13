package lab1;

import java.util.*;
public class dop
{    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        arr = insert(arr, 8, 5, 5);
            System.out.println(Arrays.toString(arr));
    }
    public static int[] insert(int[] array, int element, int occupancy, int index)
    {
        int[] nArray;
        if (index > array.length-1)
            throw new IndexOutOfBoundsException("Out of range");
        nArray = new int[occupancy + 1];
            if (occupancy == array.length)
        {
            nArray = new int[occupancy + 1];

            for (int i = 0; i < index; ++i)
                nArray[i] = array[i];
            nArray[index] = element;
            for (int i = index + 1; i < nArray.length && i - 1 < array.length; ++i)
                nArray[i] = array[i - 1];
            return nArray;
        }
        return array;
    }
}