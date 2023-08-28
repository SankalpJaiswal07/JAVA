package Array.medium;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] ans = nextpermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    static int[] nextpermutation(int[] arr) {
        int n = arr.length;
        int index = -1;
        int index2 = -1;
        for (int i = n - 2; i > 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1)
            reverse(arr, 0);
        else {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] > arr[index]) {
                    index2 = i;
                    break;
                }
            }
        }

            Swap(arr, index, index2);
            reverse(arr, index + 1);
        return arr;
    }

        static void reverse ( int[] arr, int start){
            int i = start;
            int j = arr.length - 1;
            while (i < j) {
                Swap(arr, i, j);
                i++;
                j--;
            }

        }
        static void Swap ( int[] arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

}
