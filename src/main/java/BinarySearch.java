public class BinarySearch {

    /*
    *arr - is the arr that is sorted ascending order
    * l is the curr first index
    * r is the curr last index
    * x is the element you want to find
     */
    int BinarySearchMethod (int arr[], int l, int r, int x) {
        if(r >= l) {
            int mid = (l+r-1)/2;

            if(arr[mid] == x) {
                return mid;
            }

            //Lies at the left of the arr
            if(arr[mid] > x) {
                return BinarySearchMethod(arr, l, mid - 1, x);
            } else {
                return BinarySearchMethod(arr, mid + 1, r, x);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int arr[] = {2,3,4,10,10}; //must be sorted in ascending order
        int n = arr.length;
        int x = 10;
        int results = bs.BinarySearchMethod(arr,0,n-1,x);
        if(results == -1) {
            System.out.println("Not Inside");
        } else {
            System.out.println(results);
        }
    }
}
