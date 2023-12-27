

public class Binary_search 
{

    public static void main(String[] args) 
    {

        int [] arr={1,2,3,4,5};
        System.out.println(binarySearch(arr,4));
        

    }


    private static int  binarySearch (int[] numbers, int numberToFind)
    {
        int low=0;
        int high=numbers.length-1;

        while (low<=high) 
        {
            int middlePosition=(low+high)/2;
            int middleNumber= numbers[middlePosition];

            if (numberToFind==middleNumber)
            {
                return middlePosition;
            }

            if(numberToFind < middleNumber)
            {
                high=middlePosition-1;
            }
            else
            {
                low=middlePosition+1;
            }
            
        }
        return -1;
    }
}
