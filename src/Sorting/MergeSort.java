package Sorting;

public class MergeSort {

    public void sorting(int[] num, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sorting(num, start, mid);
            sorting(num, mid + 1, end);
            merging(num, start, mid, end);
        }
    }

    private void merging(int[] num, int start, int mid, int end) {
        int[] b = new int[num.length];
        int i = start;
        int j = mid + 1;
        int k = start;
        while (i <= mid && j <= end) {
            if (num[i] < num[j]) {
                b[k] = num[i];
                i++;
            } else {
                b[k] = num[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= end) {
                b[k] = num[j];
                k++;
                j++;
            }
        } else if (i <= mid) {
            while (i <= mid) {
                b[k] = num[i];
                k++;
                i++;
            }
        }
        for (k = start; k <= end; k++) {
            num[k] = b[k];
        }
    }

    public static void main(String args[]) {
        MergeSort mergeSort = new MergeSort();
        int num[] = {2, 3, 1, 5, 9};
        System.out.println("Before Sorting");
        for (int n : num) {
            System.out.print(n + " ");
        }
        mergeSort.sorting(num, 0, num.length - 1);
        System.out.println("\nAfter Sorting");
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}
