public class Element {
    
        public static void main(String[] args) {
            int [] nums = {23, 45,17,19,35,78};
            int target = 19;
            int ans = search( nums, target);
            System.out.println(ans);
    
    
        }
        static int search ( int arr[] , int target    ){
            // for empty array 
            if ( arr.length == 0){
                return -1;
            }
            //  for getting desire index 
            for (int index = 0; index < arr.length;  index ++) {
                int element = arr[index];
                if( element == target){
                    return index;
                }
    
    
                
            }
            return -1;
    
        }
    }
    

