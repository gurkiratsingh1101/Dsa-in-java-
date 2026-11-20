public class Linearsearchwithboolean {
    public static void main(String[]args) {
        int arr[] = {20,40,60,80,100,120};
        int target = 100;
        boolean found = false;
        for(int i = 0; i <arr.length; i++) {
        if(arr[i] == target) {
        found = true;
        break;
        }
        }
        if(found) {
        System.out.println("Element found" + found);
        }
        else{
        System.out.println("Element not found" + found);
        }
        }
    }
