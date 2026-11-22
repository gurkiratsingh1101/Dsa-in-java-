public class Arraysearch {
    public int search(int arr[], int x) {
    for (int i = 0; i < arr.length; i++) {
    if (arr[i] == x) {
    return i;
    }
    }
    return -1;
    }
    public static void main(String[] args) {
        Arraysearch obj = new Arraysearch();
        int arr[] = {15, 25, 35, 45, 25, 55};
        int x = 25;
        int result = obj.search(arr, x);
        System.out.println(result);
    }
}
