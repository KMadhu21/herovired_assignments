import java.util.*;
    public class test {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Deque<Integer> deque = new ArrayDeque<>();
                HashSet<Integer> set = new HashSet<>();
                int n = sc.nextInt();
                int m = sc.nextInt();
                int max = 0;

                for (int i = 0; i < n; i++) {
                    int num = sc.nextInt();
                    deque.add(num);
                    set.add(num);
                    if(deque.size() > m){
                        int tmp = deque.pop();
                        if(!deque.contains(tmp)){
                             set.remove(tmp); 
                        }
                    }
                    if(deque.size() == m){
                        int Unique = set.size();
                        max = (Unique > max) ? Unique : max;
                    }
                }
                System.out.println(max);
                sc.close();
        }
    }