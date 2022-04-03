package DSA.Patterns;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Basic of Patterns in java
        pattern5(9);

    }

    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern3(int n){
        for(int i=0;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static  void pattern5(int n){
        for(int i=0;i<n;i++){
            if(i<=n/2){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
            }else{
                for(int x=0;x<n-i;x++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }


}
