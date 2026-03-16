import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        do{
            n=n/10;
            c++;
        }while(n!=0);
        System.out.println(c);
    }
}