public class MergeSort {

    public static void Merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;//size of the left side
        int n2 = r - m;//size of right side
        //Create temp arrays;
        int [] L = new int[n1];
        int [] R = new int[n2];

        //Copy data into temp arrays.
        for(int i = 0; i < n1; i++) {
            L[i] = arr[l+i];
        }
        for(int j = 0; j < n2; j++) {
            R[j] = arr[m+1+j];
        }
        int i = 0; //Initialise index of first subarray
        int j = 0; //Initialise index of second subarray
        int k = l; //Initialise index of merged subarray

        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int l, int r) {
        if(l>=r) {
            return;
        }
        int m = (l+r) / 2; //0-4

        mergeSort(arr,l,m); //first halve of the array
        mergeSort(arr,m+1,r); //second halve
        Merge(arr,l,m,r);
    }

    public static void printArray(int A[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(A[i] + ",");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9,8,7,6,5};
        int arr_size = arr.length;

        System.out.println("Given array is \n");
        printArray(arr, arr_size);

        mergeSort(arr, 0, arr_size - 1);

        System.out.println("\nSorted array is \n");
        printArray(arr, arr_size);
    }
}
