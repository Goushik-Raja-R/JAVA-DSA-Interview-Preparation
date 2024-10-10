import java.util.Scanner;

public class population {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int n = s.nextInt();

        int[][] maximumPop = new int[n][2];

        for(int row=0;row<n;row++){
            for(int col=0;col<2;col++)
            maximumPop[row][col] = s.nextInt();
        }

        int ans = maximumPopulation(maximumPop);

    }

    public static int maximumPopulation(int[][] maximumPop){

        int count=0;

        for(int row=0;row<maximumPop.length;row++){
            for(int col=1;col<2;col++)
            {
                for(int i=0;i<maximumPop.length;i++){
                    for(int j=0;j<2-1;j++)
                    {
                        if(row!=i){
                        if(maximumPop[row][col]>maximumPop[i][j]){
                            count++;
                        }
                    }
                    }
            }
        }
    }
}
