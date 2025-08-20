package com.Kajal;

class Pattern{

    void solution_02() {
        int n = 5;

        // Upper part
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            // stars with hollow inside
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            // stars with hollow inside
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

public class Problem_02 {
    public static void main(String[] args) {
        Pattern pt=new Pattern();
        pt.solution_02();
    }
}
