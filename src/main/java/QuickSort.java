public class QuickSort {

    int partition (int arr[], int low, int high) {
        int pivot = arr[low]; //Let the first index be the pivot
        int i = low; //Index of pivot
        for(int j = low+1; j <= high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;
        return i;
    }


    void QuickSort(int arr[], int low, int high) {
        if(low < high) {
            //Pi is the partioning index when the partition number is at the correct index
            int pi = partition(arr, low, high);
            QuickSort(arr, low, pi-1);
            QuickSort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,6,5,4,3,2,1};
        int n = arr.length;

        QuickSort qa = new QuickSort();
        qa.QuickSort(arr, 0, n-1);

        System.out.println("sorted array");

        for(int a : arr) {
            System.out.print(a + ",");
        }
    }
}
