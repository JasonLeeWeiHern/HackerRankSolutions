import java.util.ArrayList;

public class KLargest {
    //GET THE KTH LARGEST
    public static void main (String[] args) {
        int[] arr = new int[]{5,4,3,2,1};
        int k = 2;
        ArrayList<Integer> intArr = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            intArr.add(arr[i]);
        }

        SortAlgo sa = new SortAlgo();
        sa.selection_sort(intArr,0);
        System.out.println(intArr);
        int cmpNum = intArr.get(0);
        int i = 1;
        //Remove duplicates
        while(i != intArr.size()) {
            if(intArr.get(i) == cmpNum) {
                intArr.remove(i);
            } else {
                cmpNum = intArr.get(i);
                i++;
            }

        }
        System.out.println(intArr.get(intArr.size()-k));
    }
}
