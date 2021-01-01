/*import java.io.IOException;
import java.util.*;

public class gazeeebo {


    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String tc = s.nextLine();

        int int_tc = Integer.parseInt(tc); //first input (number of test cases);
        //How many test cases to run
        for(int i = 0; i < int_tc; i ++) {
            String stats = s.nextLine();
            String str_N = s.nextLine();
            int N = Integer.parseInt(str_N); //N is the number of draw downs
            String[] str_P = stats.split(" "); //storing all the stocks data in String
            ArrayList<Integer> P = new ArrayList<>();
            ArrayList<Integer> store_down = new ArrayList<>();
            for(int k = 0; k < str_P.length; k++) {
                P.add(Integer.parseInt(str_P[k]));
            }

            int decrease = 0;
            int total_decrease = 0;
            int curr_largest = P.get(0);
            int curr_largest_index = 0;
            Boolean check_peak = false;
            //5 4 3 4 3 4 5 6 7 4 3 6 2 10
            for(int j = 0; j < P.size()-1; j++) {
                //check if theres a small peak
                for(int o = curr_largest_index; o < j+1; o++) {
                    if(P.get(j+1) > P.get(o)) {
                        check_peak = true;
                    }
                }
                if (curr_largest > P.get(j+1) && check_peak.equals(false)) {
                    decrease = P.get(j) - P.get(j+1);
                    total_decrease += decrease;
                } else {
                    curr_largest = P.get(j+1);
                    curr_largest_index = j+1;
                    if(total_decrease != 0) {
                        store_down.add(total_decrease);
                    }
                    total_decrease = 0;
                    check_peak = false;
                }
            }
            Boolean isEmpty = store_down.isEmpty();
            if (isEmpty.equals(false)) {
                Comparator c = Collections.reverseOrder();
                Collections.sort(store_down, c);
                if(store_down.size() < N) {
                    N = store_down.size();
                }
                System.out.println(store_down);
                for (int l = 0; l < N; l++) {
                    System.out.print(store_down.get(l) + " ");
                }
                System.out.println("");
            } else {
                System.out.println("None");
            }
        }
    }
}*/
