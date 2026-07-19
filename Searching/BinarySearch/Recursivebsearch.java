public class Bsearchrec{
    public static int Bsearch(int[] arr, int st, int end,int target){
        if(st>end){
            return -1;
        }

        int mid = st + (end - st) / 2;

        if(arr[mid] == target){
            return mid;
        }

        if(target < arr[mid]){
            return Bsearch(arr, st, mid-1, target);
        }
        else{
            return Bsearch(arr, mid+1, end, target);
        }
    }
    public static void main(String[] args){
        int[] arr={2,4,6,32,44,54,70,88};
        int target = 32;

        int index= Bsearch(arr,0,arr.length-1,target);

        if(index != -1){
            System.out.println("Element found ar index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
