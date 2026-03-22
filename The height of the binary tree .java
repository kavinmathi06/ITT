// You are using Java
import java.util.*;
import java.util.Scanner;
class TreeHeight{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int n=sc.nextInt();
        if(n<=0){
            System.out.println(0);
        }
        int[] p=new int[n];
        int[] d=new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
            d[i]=-1;
        }
        int maxTreeHeight=0;
        for(int i=0;i<n;i++){
            maxTreeHeight=Math.max(maxTreeHeight,getDepth(i,p,d));
        }
        System.out.println(maxTreeHeight);
    }
    private static int getDepth(int i,int[] p,int[] d){
        if(p[i]==-1){
            return d[i]= 0;
        }
        if(d[i]!=-1){
            return d[i];
        }
        d[i]=1+getDepth(p[i],p,d);
        return d[i];
    }
}