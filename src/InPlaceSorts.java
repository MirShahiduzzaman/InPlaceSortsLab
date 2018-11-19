public class InPlaceSorts
{
    /**
     * Sorts a list of integers by using insertion sort
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
     * Sorts a list of Doubles using selection sort
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


    public static void bubbleSort(String[] list1)
    {
        int swapNum = 1;
        while(swapNum!=0)
        {
            swapNum = 0;
            for(int i = 0;i<list1.length-1;i++)
            {
                for(int a = 0;a<list1[i].length();a++)
                {
                    //checks if checking letter is at higher index than length of next word
                    if(a>=list1[i+1].length())
                    {
                        swap(list1,i,i+1);
                        swapNum++;
                    }
                    else
                    {
                        if(((list1[i].substring(a,a+1)).compareTo(list1[i+1].substring(a,a+1)))>0)
                        {
                            swap(list1,i,i+1);
                            swapNum++;
                        }
                    }
                }
            }
        }
    }

    //DELETE LATER BC NOT NEEDED
    public static void bubbleSort(int[] arr)
    {
        int swapNum = 1;
        while(swapNum != 0)
        {
            swapNum = 0;
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    swap(arr,i,i+1);
                    swapNum++;
                }
            }
        }
    }

    public static void swap(int[] arr,int pos1,int pos2)
    {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void swap(double[] arr,int pos1,int pos2)
    {
        double temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void swap(String[] arr,int pos1,int pos2)
    {
        String temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
