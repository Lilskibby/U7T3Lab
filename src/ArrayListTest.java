import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));

        //COMPLETE ME!
        for(int i = 1; i < numList.size() - 2; i++)
        {
            numList.set(i - 1, numList.get(i) + numList.get(i + 1));
        }
        System.out.println(numList);


    }
}
