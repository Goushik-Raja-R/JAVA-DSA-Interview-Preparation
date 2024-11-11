import java.util.Scanner;

// 26. Remove Duplicates from Sorted Array : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class SortedDuplicate {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }

    public static int removeDuplicates(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < size - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    size--;
                    j--;
                }
            }
        }
        return size;

        // HashSet<Integer> set = new HashSet<>();

        // for (int i = 0; i < arr.length; i++) {
        // set.add(arr[i]);
        // }

        // ArrayList<Integer> list = new ArrayList<>(set);

        // for (int i = 0; i < set.size(); i++) {
        // arr[i] = list.get(i);
        // }

        // return set.size();

    }
}
