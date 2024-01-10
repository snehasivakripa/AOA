package Sorting;
public class InsertionSort {

    public void sort(int[] num){

        for(int j=2;j< num.length;j++){
            int key=num[j];
            int i=j-1;
            while (i>=0 && num[i]>key){
                num[i+1]=num[i];
                i--;

            }
            num[i+1]=key;
        }
    }
 public static void main(String args[]){
     InsertionSort insertionSort=new InsertionSort();
     int num[]={2,3,1,5,9};
     System.out.println("Before Sorting");
     for(int n: num) {
         System.out.print(n+" ");
     }
     insertionSort.sort(num);
     System.out.println("\nAfter Sorting");
     for(int n: num) {
         System.out.print(n+" ");
     }
 }
}
