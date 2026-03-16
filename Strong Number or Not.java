import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int tem=num;
        int sum=0;
        while(tem>0){
            int d=tem%10;
            int fact=1;
            for(int i=1;i<=d;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            tem=tem/10;
        }
        if(num==sum){
            System.out.println(num + " Strong Number");
        }
        else{
            System.out.println(num + " Not Strong Number");
        }
    }
}