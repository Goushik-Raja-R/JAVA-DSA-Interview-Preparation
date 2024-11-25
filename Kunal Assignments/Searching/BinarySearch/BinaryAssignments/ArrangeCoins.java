public class ArrangeCoins {
    public static void main(String[] args) {
        int num = 8;
        int ans = CoinsArranged(num);
        System.out.println(ans);
    }

    public static int CoinsArranged(int n) {

        int rows = 0;

        while (n > rows) {
            rows++;
            n = n - rows;
        }
        return rows;

        // long sum=0,ans=0;

        // for(int i=1;i<=n;i++){

        // sum=sum+i;
        // if(sum<=n)
        // ans=i;
        // else
        // break;
        // }
        // return (int)ans;
    }
}
