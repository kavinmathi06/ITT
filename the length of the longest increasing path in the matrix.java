// You are using Java
import java.util.*;
class Main{
    private static final int[][] DIRECTIONS={{0,1},{0,-1},{1,0},{-1,0}};
    private static int[][] memo;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int m=sc.nextInt();
        if(!sc.hasNextInt()) return;
        int n=sc.nextInt();
        int[][] matrix=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(findLongest(matrix,m,n));
    }
    public static int findLongest(int[][] matrix,int m,int n){
        if(m==0||n==0) return 0;
        memo=new int[m][n];
        int max1=0; 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max1=Math.max(max1,dfs(matrix,i,j,m,n));
            }
        }
        return max1;
    }
    private static int dfs(int[][] matrix,int r,int c,int m,int n){
        if(memo[c][r]!=0){
            return memo[r][c];
        }
        int current=1;
        for(int[] dir:DIRECTIONS){
            int nextr=r+dir[0];
            int nextc=c+dir[1];
            if(nextr>=0&&nextr<m&&nextc>=0&&nextc<n&&matrix[nextr][nextc]>matrix[r][c]){
                int length=1+dfs(matrix,nextr,nextc,m,n);
                current=Math.max(current,length);
            }
        }
        memo[r][c]=current;
        return current;
    }
}