public class Duplicate_Array 
{
    public static void main(String[] args) {
        int[]arr = new int[]{10, 20, 30, 40, 20, 50, 10 };
        System.out.println("Duplicate number in this array: ");//Searches for duplicate number

        for(int i = 0;i < arr.length;i++){
            for (int j = i + 1; j < arr.length;j++){
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);

            }
        }



    }
    
    
}
