// https://www.youtube.com/watch?v=AZOmHuHadxQ&list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF&index=9

public class FindSingle {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };

        int ans = FindSingleElement(arr);
        System.out.println(ans);
    }

    public static int FindSingleElement(int[] arr) {

        if (arr.length == 1)
            return arr[0];

        if (arr[1] != arr[0])
            return arr[0];

        if (arr[arr.length - 1] != arr[arr.length - 2])
            return arr[arr.length - 1];

        int start = 1;
        int end = arr.length - 2;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            } else if ((mid % 2 == 1 && arr[mid - 1] == arr[mid]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
