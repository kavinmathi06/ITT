// You are using Java
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main{
    public String custom(String order,String s){
        Map<Character,Integer>counts=new HashMap<>();
        for(char c:s.toCharArray()){
           counts.put(c,counts.getOrDefault(c,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        for(char c:order.toCharArray()){
            if(counts.containsKey(c)){
                for(int i=0;i<counts.get(c);i++){
                    sb.append(c);
                }
                counts.remove(c);
            }
        }
        for(char c:counts.keySet()){
            for(int i=0;i<counts.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Main m=new Main();
        String order=sc.next();
        String s=sc.next();
        String output=m.custom(order,s);
        System.out.println(output);
    }
}