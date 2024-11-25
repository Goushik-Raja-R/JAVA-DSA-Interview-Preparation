// I'll be back;

public class FindKthMissNum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int find =5;
        int ans = findKthPositive(arr,find);
        System.out.println(ans);
    }

    public static int findKthPositive(int[] arr,int find){

        int count=0,num=1;

        for(int i=1;i<arr.length;i++){
            if(num!=i){
                count++;
            }
            num++;
            if(count==find){
                return 0;
            }
        }
        return 1;
    }
}
