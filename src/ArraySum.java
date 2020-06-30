public class ArraySum
{
    public static void main(String args[])
    {
        //Initialize array
        int [] arr = new int [] {12 , 22, 33, 44, 55};
        int sum = 0;
        //Loop for array to calculate sum
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}


