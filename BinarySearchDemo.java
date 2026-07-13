import java.util.*;

public class BinarySearchDemo{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int  n=sc.nextInt();

        int arr[]=new int[n];

        System.out.print("Enter elements in any order (NOTE: THE SEARCHING WILL BE DONE ON SORTED VERSION OF ARRAY): ");
        for(int i=0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.print("Enter element to search in array: ");
        int target = sc.nextInt();
        
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid = st + (end - st)/2;

            if(arr[mid]== target){
                System.out.println("In sorted array element will be at: " + mid);
                sc.close();
                return;
            }

            else if (arr[mid] < target) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        System.out.println("Element not Found");
        sc.close();

    }
}