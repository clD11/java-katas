package interview_preperation.arrays;

public class RightRotation {

    public int[] rotateRight(int[] arr, int x) {
        int counter = 0;
        while ( counter < x ) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            counter++;
        }
        return arr;
    }

}
