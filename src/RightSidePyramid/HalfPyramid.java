package RightSidePyramid;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 26/02/22
 * Time: 17:51
 */


public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int row = 0; row < n; row++) {
            for (int col = 1; col <= row+1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}