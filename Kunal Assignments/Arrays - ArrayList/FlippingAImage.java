import java.util.Arrays;
import java.util.Scanner;

// 832. Flipping an Image : https://leetcode.com/problems/flipping-an-image/description/

public class FlippingAImage {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array Size: ");
        int size = s.nextInt();
        int[][] arr = new int[size][size];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = s.nextInt();
            }
        }

        int[][] ans = flipAndInvertImage(arr);

        for (int[] num : ans) {
            System.out.println(Arrays.toString(num));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image.length];
        for (int row = 0; row < image.length; row++) {
            int k = 0;
            for (int col = image.length - 1; col >= 0; col--) {
                res[row][k] = image[row][col];
                k++;
            }
        }
        int[][] copy = call(res);
        return copy;

        // for(int i=0;i<image.length;i++)
        // {
        //    int low =0;
        //    int high =image[i].length-1;

        //    while(low<=high){
        //        if(image[i][low] == image[i][high]){
        //            image[i][low] = 1-image[i][low];
        //            image[i][high] = image[i][low];
        //        }
        //        low++;
        //        high--;
        //    }
        // }
        // return image;
    }

    public static int[][] call(int[][] res) {
        for (int row = 0; row < res.length; row++) {
            for (int col = 0; col < res.length; col++) {
                if (res[row][col] == 1)
                    res[row][col] = 0;
                else
                    res[row][col] = 1;
            }
        }
        return res;
    }
}
