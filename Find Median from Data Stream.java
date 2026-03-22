import java.util.*;

class Main {
    // Max-heap for the lower half
    private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    // Min-heap for the upper half
    private PriorityQueue<Integer> large = new PriorityQueue<>();

    public void add(int n) {
        small.offer(n);
        large.offer(small.poll());
        // Keep small heap size >= large heap size
        if (small.size() < large.size()) {
            small.offer(large.poll());
        }
    }

    public double findMedian() {
        if (small.size() > large.size()) {
            return small.peek();
        } else {
            // Use 2.0 to ensure double division
            return (small.peek() + large.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    m.add(sc.nextInt());
                    double median = m.findMedian();
                    
                    // Formatting to remove .0 if it's a whole number
                    if (median == (long) median) {
                        System.out.println((long) median);
                    } else {
                        System.out.println(median);
                    }
                }
            }
        }
    }
}
