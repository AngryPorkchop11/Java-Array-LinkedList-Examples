import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //***************************************************************************//
        //*******************************Example 1***********************************//
        //Showing how to grow an array w/out using the ArrayList class//
        //Initial array -- but we need it to grow
        int[] nums = {1, 2, 3, 4};
        System.out.print("First Array:");
        System.out.println(Arrays.toString(nums));

        //Make a bigger array and copy
        int[] newNums = new int[nums.length + 5];
        //Copy the initial array into the bigger array
        System.arraycopy(nums, 0, newNums, 0, nums.length);
        //This shows that the first array copied into the new and 0 are the default values until we initialize them
        System.out.print("Bigger Array W/ Default Values: ");
        System.out.println(Arrays.toString(newNums));

        //Fill bigger array with new additional data
        for(int i = nums.length; i < newNums.length; i++ ) {
            newNums[i] = -1;
        }
        System.out.print("Bigger Array Filled: ");
        System.out.println(Arrays.toString(newNums));
        //***************************************************************************//
        //*******************************Example 2***********************************//
        //Showing how to grow an array using the ArrayList class//
        // Size of the array
        int size = 5;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(size);
        for (int i = 0; i <= size; i++ ) {
            arrayList.add(i);
        }
        System.out.print("\nUsing the ArrayList: ");
        System.out.println(arrayList);
        //Showing how this array can grow easily
        System.out.println("---------------------GROW---------------------");
        for (int i = arrayList.size(); i < 8; i++) {
            arrayList.add(-1);
            System.out.print("\nThe Array is growing: ");
            System.out.println(arrayList);
        }
    }
}
