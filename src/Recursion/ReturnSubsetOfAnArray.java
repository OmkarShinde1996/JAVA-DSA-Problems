package Recursion;

public class ReturnSubsetOfAnArray {
    public static int[][] subsets(int input[],int si){
        if(si==input.length)
        {int[][]ret=new int [1][0];
            return ret;
        }
        int [][]rss =subsets(input,si+1);
        int [][]tss=new int[rss.length*2][];

        int i=0;
        for(;i<rss.length;i++) {
            tss[i]=new int [rss[i].length];
        }
        int k=0;
        for(;k<rss.length;k++) {
            tss[i]=new int [rss[k].length+1];
            i++;
        }
        int j=0;
        for(i=0;i<rss.length;i++) {
            for(j=0;j<rss[i].length;j++){
                tss[i][j]=rss[i][j];
            }
        }
        for(k=i;k<tss.length;k++)  {
            tss[k][0]=input[si];
        }
        int r=i;
        for(i=0;i<rss.length;i++) {
            for(j=0;j<rss[i].length;j++){
                tss[r][j+1]=rss[i][j];
            }
            r++;
        }
        return tss;
    }



    //
    public static int[][] subsets_1(int input[],int si){
        if(si>=input.length)
        {
            int ans[][]=new int[1][0];
            return ans;
        }
        int[][] smallans=subsets(input,si+1);
        int[][] ans=new int[smallans.length*2][];
        int k=0;
        for(int i=0;i<smallans.length;i++){
            ans[i]=new int[smallans[i].length];
            for(int j=0;j<smallans[i].length;j++){
                ans[i][j]=smallans[i][j];
            }
            k++;
        }
        for(int i=0;i<smallans.length;i++){
            ans[k+i]=new int[smallans[i].length+1];
            ans[k+i][0]=input[si];
            for(int j=1;j<=smallans[i].length;j++)
            {
                ans[i+k][j]=smallans[i][j-1];
            }
        }
        return ans;
    }
//



    public static int[][] subsets(int input[]){
        //return subsets(input,0);
        return subsets_1(input,0);
    }
    public static void main(String[] args) {
        int[] input = {1,2,3};
        int output[][] = subsets(input);
        for(int i = 0; i < output.length; i++) {
            for(int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}
