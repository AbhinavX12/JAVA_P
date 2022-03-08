package DSA.Sorting;

//It takes time complexity of O(N) in best case and in the worst case O(N2)
public class BubbleSort {
    int[] bubbleSort(int[] arr){
        int len=arr.length;

        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];;
                    arr[j+1]=temp;

                }
            }
        }

        return arr;
    }
}
