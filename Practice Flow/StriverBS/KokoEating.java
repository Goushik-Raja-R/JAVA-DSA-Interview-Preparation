//Striver BS 12:

public class KokoEating {
    public static void main(String[] args) {
        int[] arr = { 30, 11, 23, 4, 20 };
        int hour = 5;

        int ans = minEatingSpeed(arr, hour);
        System.out.println(ans);
    }

    public static int minEatingSpeed(int[] arr, int hour) {

        int maxSpeed = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpeed)
                maxSpeed = arr[i];
        }

        int minSpeed = 1;

        while (minSpeed < maxSpeed) {

            int mid = minSpeed + (maxSpeed - minSpeed) / 2;

            if (Find(mid, hour, arr)) {
                maxSpeed = mid;
            } else {
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }

    public static Boolean Find(int Speed, int hour, int[] arr) {

        int cal = 0;

        for (int i = 0; i < arr.length; i++) {
            cal = cal + (arr[i] + Speed - 1) / Speed;
        }
        return cal <= hour;
    }
}
