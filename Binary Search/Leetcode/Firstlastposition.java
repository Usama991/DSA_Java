public class Firstlastposition {
    public static void main(String[] args) {
        int [] arr = {1,4,7,7,7,7,7,9,11};
        int target = 7;
        findnumber(arr,target);





    }
    static int [] findnumber(int []arr, int target) {
        int [] ans  = {-1,-1};
        int start = search( arr,target, true) ;
        int end = search(arr, target, false);
        ans [0]= start;
        ans [1] = end;

     return ans;


    }

    static int search(int []arr, int target, boolean indexfirst){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;

            }else
                ans = mid;
            if (indexfirst){
                end = mid-1;
            }else{
                start = mid +1;
            }


        }
        return ans;

    }

}
