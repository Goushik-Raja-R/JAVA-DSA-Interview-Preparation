import java.util.ArrayList;
import java.util.Arrays;

public class NegativeElements {
    public static void main(String[] args) {
        int[] arr = { -5, 7, -3, -4, 9, 10, -1, 11 }; // 1,3,2,11,6,-1,-7,-5;

        int[] ans = Sort(arr);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] Sort(int[] arr) {

        int NegCount = 0;
        int PosCount = 0;

        int[] newarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            newarr[i] = arr[i];

            if (arr[i] > 0) {
                PosCount++;
            } else {
                NegCount++;
            }
        }

        System.out.println(PosCount + " " + NegCount);

        int[] pos = new int[PosCount];
        int[] Nigga = new int[NegCount];
        int k = 0, kk = 0;

        for (int i = 0; i < newarr.length; i++) {
            if (newarr[i] > 0) {
                pos[k] = newarr[i];
                k++;
            } else {
                Nigga[kk] = newarr[i];
                kk++;
            }
        }

        for (int i = 0; i < pos.length; i++) {
            arr[i] = pos[i];
        }
        int h = 0;
        for (int j = PosCount; j < arr.length; j++) {
            arr[j] = Nigga[h];
            h++;
        }

        return arr;
    }
}
