public class InPlaceSorts
{
    public static void insertionSort(int[] list1)
    {

    }

    public static void selectionSort(double[] arr)
    {
        int swapPos = 0;
        double min = 0;

        for(int i = 0;i<arr.length;i++)
        {
            swapPos = i;
            min = arr[i];

            for(int a = 0;a<arr.length;a++)
            {
                if(arr[a]<min)
                {
                    swapPos = a;
                    min = arr[a];

                    swap(arr,swapPos,i);
                }
            }
        }
    }

    public static void bubbleSort(String[] list1)
    {

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
    //NOT NEEDED BC INT ARRAY
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
}
