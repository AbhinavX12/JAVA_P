package DSA.Searching.BinarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7};
//        int[] arr1={7,6,5,4,3,2,1};
////        BinarySearch binarySearch=new BinarySearch();
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Enter the number you want to search using the binary algorithm:");
//        int target=scanner.nextInt();
////        int index=binarySearch.find(arr,target);
////
//        OrderAgnoisticBinarySearch orderAgnoisticBinarySearch=new OrderAgnoisticBinarySearch();
//        int index1=orderAgnoisticBinarySearch.findIndex(arr,target);
//        if(index1!=-1){
//            System.out.println("The target number is at "+index1);
//        }else{
//            System.out.println("Oops!The target element could not be found");
//        }

//        PerfectSquare perfectSquare=new PerfectSquare();
//        boolean result=perfectSquare.findPerfectSquare(1);
//        System.out.println(result);

        int[] arr11={2,3,5,9,14,16,18};
//        Ceil ceil=new Ceil();
//        int index=ceil.findCeil(arr11,4);
//        System.out.println(index);

        Floor floor=new Floor();
        int num= floor.findFloor(arr11,10);
        System.out.println(num);

        // Smallest char that is greater than the given target

//        char[] letters={'a','b'};
//        char target='z';
//        SmallestChar smallestChar=new SmallestChar();
//        char result=smallestChar.findSmallestChar(letters,target);
//        System.out.println(result);



    }
}
