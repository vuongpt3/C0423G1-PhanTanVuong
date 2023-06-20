package bai_13_find_the_ascending_sequence_with_the_largest_length.thuc_hanh;

public class BinarySearch {
    public static int[] list = {2,4,7,10,13,15,17,20,25,29,30,40};
    public static int binarySearch(int[] list , int key){
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 10));
    }
}
