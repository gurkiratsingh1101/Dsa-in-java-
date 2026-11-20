public class Linearsearch {
public static void main(String args []) {
    int arr[] = {10,15,25,35,45,55};
    int target =35;
    int found = -1;
    for(int i =0; i<arr.length; i++) {
    if(arr[i] == target) {
    found = i;
    break;
    }
    }
    if(found !=-1) {
    System.out.println("It found on index: "+ found);
    }
    else {
    System.out.println("Element not found ");
    }   
}
}
