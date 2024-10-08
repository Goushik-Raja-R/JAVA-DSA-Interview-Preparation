import java.util.ArrayList;
import java.util.Scanner;

// 989. Add to Array-Form of Integer : https://leetcode.com/problems/add-to-array-form-of-integer/description/

public class AddArrayToInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the Intger You want to add: ");
        int k = s.nextInt();

        ArrayList<Integer> list = addToArrayForm(arr, k);
        System.out.println(list);
    }

    public static ArrayList<Integer> addToArrayForm(int[] nums, int k) {

        long sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            sum = sum * 10 + nums[i];
        }
        sum += k;
        String str = Long.toString(sum);

        for (int i = 0; i < str.length(); i++) {
            list.add(Character.getNumericValue(str.charAt(i)));
        }

        return list;

        // LinkedList<Integer> list = new LinkedList<>();

        // for(int i=nums.length-1;i>=0;i--)
        // {
        //     list.add(0,(nums[i]+k)%10);
        //     k=(nums[i]+k)/10;
        // }

        // while(k>0){
        //     list.add(0,k%10);
        //     k/=10;
        // }
        // return list;
    }

}
