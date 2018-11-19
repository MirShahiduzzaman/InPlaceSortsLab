public class InPlaceSorts
{
    /**
     * Sorts an array of integers using insertion sort
     * @param list1 array to sort
     */
    public static void insertionSort(int[] list1)
    {
        int swapPos;
        int min;

        for(int i = 1;i<list1.length;i++)
        {
            swapPos = i;
            min = list1[swapPos];

            for(int a = i-1;a>=0;a--)
            {
                if(list1[a]>min)
                {
                    swap(list1,swapPos,a);
                    swapPos = a;
                    min = list1[swapPos];
                }
                else
                {
                    a=-1;
                }
            }
        }
    }

    /**
     * Sorts an array of doubles using selection sort
     * @param list1 array to sort
     */
    public static void selectionSort(double[] list1)
    {
        int swapPos;
        double min;

        for(int i = 0;i<list1.length;i++)
        {
            swapPos = i;
            min = list1[swapPos];

            for(int a = i;a<list1.length;a++)
            {
                if(list1[a]<min)
                {
                    swapPos = a;
                    min = list1[a];

                    swap(list1,swapPos,i);
                }
            }
        }
    }

    /**
     * Sorts an array of Strings into alphabetical order using bubble sort
     * @param list1 array to sort
     */
    public static void bubbleSort(String[] list1)
    {
        int swapNum = 1;
        while(swapNum!=0)
        {
            swapNum = 0;
            for(int i = 0;i<list1.length-1;i++)
            {
                if(list1[i].compareTo(list1[i+1])>0)
                {
                    swap(list1,i,i+1);
                    swapNum++;
                }
            }
        }
    }

    /**
     * swaps two items in an integer array
     * @param arr array that we will swap items for
     * @param pos1 selected position value to swap
     * @param pos2 other selected position value to swap
     */
    public static void swap(int[] arr,int pos1,int pos2)
    {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    /**
     * swaps two items in a double array
     * @param arr array that we will swap items for
     * @param pos1 selected position value to swap
     * @param pos2 other selected position value to swap
     */
    public static void swap(double[] arr,int pos1,int pos2)
    {
        double temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    /**
     * swaps two items in a String array
     * @param arr array that we will swap items for
     * @param pos1 selected position value to swap
     * @param pos2 other selected position value to swap
     */
    public static void swap(String[] arr,int pos1,int pos2)
    {
        String temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
