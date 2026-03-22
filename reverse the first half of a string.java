import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            // Consume the leftover newline after nextInt()
            sc.nextLine(); 

            if (n <= 0) {
                return; // Exit if no words to process
            }

            for (int i = 0; i < n; i++) {
                if (sc.hasNextLine()) {
                    String word = sc.nextLine();
                    // Basic check to ensure we don't process empty strings if the input has extra newlines
                    if (word.isEmpty() && i == 0) { 
                        word = sc.nextLine();
                    }
                    System.out.println(wink(word));
                }
            }
        }
    }

    public static String wink(String s) {
        if (s == null || s.length() <= 1) return s;
        
        int mid = s.length() / 2;
        String firstHalf = s.substring(0, mid);
        String secondHalf = s.substring(mid);
        
        // Reverse firstHalf and join with secondHalf
        StringBuilder sb = new StringBuilder(firstHalf);
        return sb.reverse().toString() + secondHalf;
    }
}
