package leetCode;

import java.util.Arrays;

public class FindRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean result=false;
        int[][] newArr=new int[mat.length][mat.length];

        for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat.length;j++){
                    newArr[j][mat.length-1-i]=mat[i][j];

                }


            }

        int[][] newArr1=new int[mat.length][mat.length];

        for(int[] item:newArr){
            System.out.println(Arrays.toString(item));
        }




        return result;
    }
}
