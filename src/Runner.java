/**Mir Shahiduzzaman 11/18/2018*/
public class Runner
{
    public static void main(String[] args)
    {
        double[] check = randDoubleArr(1000);
        printArr(check);

        long start = System.currentTimeMillis();
        InPlaceSorts.selectionSort(check);
        long diff = System.currentTimeMillis() - start;
        printArr(check);
        System.out.println(diff + "\n");

        int[] check2 = randIntArr(1000);
        printArr(check2);

        start = System.currentTimeMillis();
        InPlaceSorts.insertionSort(check2);
        diff = System.currentTimeMillis() - start;
        printArr(check2);
        System.out.println(diff + "\n");

        String[] check3 = randStringArr(4,5);
        printArr(check3);

        start = System.currentTimeMillis();
        InPlaceSorts.bubbleSort(check3);
        diff = System.currentTimeMillis() - start;
        printArr(check3);
        System.out.println(diff + "\n");
    }

    /**
     * Creates array of random doubles
     * @param count number of number in the array
     * @return array with random doubles
     */
    public static double[] randDoubleArr(int count)
    {
        double[] randArr = new double[count];

        for(int i=0; i<randArr.length;i++)
        {
            randArr[i] = Math.random()*10001;
        }
        return(randArr);
    }

    /**
     * Creates array of random integers
     * @param count number of number in the array
     * @return array with random integers
     */
    public static int[] randIntArr(int count)
    {
        int[] randArr = new int[count];

        for(int i=0; i<randArr.length;i++)
        {
            randArr[i] = (int)(Math.random()*10001);
        }
        return(randArr);
    }

    /**
     * Makes a random array of Strings
     * @param num the length of the array
     * @param length the length of the Strings to be made
     * @return array of random Strings
     */
    public static String[] randStringArr(int num, int length)
    {
        String[] arr = new String[num];
        while(num>0)
        {
            int i = 0;
            String s = "";
            while(i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s+c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return(arr);
    }

    /**
     * Prints array with commas separating each value
     * @param arr double array to print
     */
    public static void printArr(double[] arr)
    {
        String out = "";

        for(int i =0;i<arr.length;i++)
        {
            out += arr[i];
            if(i != arr.length-1)
            {
                out += ", ";
            }
        }
        System.out.println(out);
    }

    /**
     * Prints array with commas separating each value
     * @param arr int array to print
     */
    public static void printArr(int[] arr)
    {
        String out = "";

        for(int i =0;i<arr.length;i++)
        {
            out += arr[i];
            if(i != arr.length-1)
            {
                out += ", ";
            }
        }
        System.out.println(out);
    }

    /**
     * Prints array with commas separating each value
     * @param arr String array to print
     */
    public static void printArr(String[] arr)
    {
        String out = "";

        for(int i =0;i<arr.length;i++)
        {
            out += arr[i];
            if(i != arr.length-1)
            {
                out += ", ";
            }
        }
        System.out.println(out);
    }
}

