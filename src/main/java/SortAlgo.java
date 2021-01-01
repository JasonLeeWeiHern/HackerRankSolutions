import java.util.ArrayList;

public class SortAlgo {
    public static ArrayList<Integer> selection_sort(ArrayList<Integer> arr, int L) {
        int currentMin = 1000000;
        int indexOfMin = L;
        // Get the minimum number.
        for(int i = L; i < arr.size(); i++) {
            if(arr.get(i) < currentMin) {
                currentMin = arr.get(i);
                indexOfMin = i;
            }
        }
        int valueOfL = arr.get(L);
        arr.set(indexOfMin, valueOfL);
        arr.set(L, currentMin);
        //last second and the last will be biggest
        if(L == arr.size() - 2) {
            return arr;
        }
        return selection_sort(arr, L + 1);
    }
    public static ArrayList<Integer> BubbleSort(ArrayList<Integer> arr) {
        boolean isPass = false;
        while(!isPass) {
            isPass = true;
            for(int i = 0; i < arr.size() - 1; i++) {
                if(arr.get(i) > arr.get(i+1)) {
                    int T = arr.get(i);
                    arr.set(i, arr.get(i+1));
                    arr.set(i+1,T);
                    isPass = false;
                }
            }
        }
        return arr;
    }

//    public static Integer Merge (ArrayList<Integer> arr, Integer l, Integer m, Integer r) {
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        for(int i = 0; i < n1; i++) {
//
//        }
//    }

//    public static Integer MergeSort (ArrayList<Integer> arr, Integer l, Integer r) {
//        if(l >= r) {
//            return 0;
//        }
//        int m = (l+r-1)/2;
//        MergeSort(arr, l, m);
//        MergeSort(arr, m+1, r);
//        Merge(arr,l,m,r);
//    }
}
