import java.util.ArrayList;

public class Array_Specificvalue
{
    public static void main(String args[])
    {
        int[] array = {55, 45, 69, 44};
        int num = 55;

        for (int i = 0; i < array.length; i++)
        {
            if (num == array[i]) {
                System.out.println("Array contains a specific value");
            }
        }


    }}