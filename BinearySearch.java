public class Binarysearch {
    public static void main(String []args) {
    int arr[] = {5,10,15,20,25,30,35};
    int target = 25;
    int low = 0;
    int high = arr.length-1;
    int found = 0;

    while (low <=high){
    int mid = (low + high)/2;
    if(arr[mid]== target) {
    found = 1;
    System.out.println("Element found at index : " + mid);
    break;
    }
    else if (arr[mid] < target) {
    low = mid + 1;
    }
    else {
    high = mid -1;
    }
    }
    if (found==0) {
    System.out.println("Element not found");
    }
}
}
