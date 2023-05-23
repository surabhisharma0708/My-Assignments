package BasicDS;
class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue)
    {
        boolean flag = false;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] == toCheckValue)
            {
                flag = true;
            }

        }
        return flag;
    }
}
public class Assignment1Q7
{
    public static void main(String[] args)
    {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 20;
        SearchArray obj = new SearchArray();
        boolean flag = obj.searchArray(arr, valueToCheck);
        if(flag == true)
        {
            System.out.println("Value to be searched is "+ valueToCheck);
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}
