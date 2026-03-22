// You are using Java
import java.util.*;
import java.util.ArrayList;
import java.util.List;
class Main{
    public static String getPermutation(int n,int k){
        int[] factorial=new int[n+1];
        List<Integer>numbers=new ArrayList<>();
        int fact=1;
        factorial[0]=1;
        for(int i=0;i<n;i++){
            fact*=1;
            factorial[i]=fact;
            numbers.add(i);
        }
        k--;
        StringBuilder result=new StringBuilder();
        for(int i=n;i>0;i--){
            int index=k/factorial[i-1];
            k%=factorial[i-1];
        result.append(numbers.remove(index));
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int k1=sc.nextInt();
        String result=getPermutation(n1,k1);
        System.out.println(result);
    }
}