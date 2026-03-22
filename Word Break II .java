// You are using Java
import java.util.*;
class Main{
    private static Map<String,List<String>>memo=new HashMap<>();
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNext()) return;
        String s=sc.next();
        if(!sc.hasNextInt()) return;
        int n=sc.nextInt();
        
        Set<String> word=new HashSet<>();
        for(int i=0;i<n;i++){
            word.add(sc.next());
        }
        memo.clear();
        List<String> result=wordBreak(s,word);
        Collections.sort(result);
        if(!result.isEmpty()){
            System.out.println(result);
        }
    }
    public static List<String> wordBreak(String s,Set<String>word){
        if(memo.containsKey(s)){
            return memo.get(s);
        }
        List<String>res=new ArrayList<>();
        if(s.isEmpty()){
            res.add("");
            return res;
        }
        for(String w:word){
            if(s.startsWith(w)){
                List<String>subList=wordBreak(s.substring(w.length()),word);
                for(String sub:subList){
                    res.add(w+(sub.isEmpty()?"":" ")+sub);
                }
            }
        }
        memo.put(s,res);
        return res;
    }
}