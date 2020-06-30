public class Accending_Array
{
    public static void main(String[] args)
    {
        int arr[] = {32, 54, 31, 52, 45};
        int temp = 0;
        System.out.println("Display of original array: ");

        for (int i = 0;i<arr.length;i++)
        {
       System.out.println(arr[i]+" ");

        }
        //Sort the array in ascending order
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }
        System.out.println();

        //Display element after array sorting
        System.out.println("Element of array sorted in ascending order:");
        for (int i = 0;i <arr.length;i++)
        {
            System.out.println(arr[i]+" ");

        }

    }
}
