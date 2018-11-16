public class Runner
{
    public static void main(String[] args)
    {
        double[] check = randArr(1000);
        printArr(check);

        long start = System.currentTimeMillis();
        //Place method here
        InPlaceSorts.selectionSort(check);
        long diff = System.currentTimeMillis() - start;
        printArr(check);
        System.out.println(diff);
    }

    public static double[] randArr(int count)
    {
        double[] randArr = new double[count];

        for(int i=0; i<randArr.length;i++)
        {
            randArr[i] = Math.random()*10001;
        }
        return(randArr);
    }

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
}

