public class Celling {
    public static void main(String[] args) {
        int [] arr = {-19,-11,0,2,4,5,7,11,15,17,22,26};
        int target = 30;
        int ans =cellingNo(arr, target);
        System.out.println(ans);

    }
    static  int cellingNo (int[]arr, int target){
        if (target> arr.length-1){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<= end){
            int mid = start +(end - start) / 2;
            if (  target  <   arr[mid] )
            {  end = mid-1;
            }
            else if (  target  > arr[mid] ){
                start = mid +1;

            }
            if (arr[mid] == target){
                return mid;
            }

        }
        return start;
    }
}