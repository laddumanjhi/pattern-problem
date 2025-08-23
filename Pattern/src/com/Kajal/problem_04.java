package com.Kajal;

class pyramid{
    void pettern()
    {
        int num =5;
        for (int i=1; i<=num; i++){
            for (int j=num; j>i-1; j--){
                System.out.print("  ");
            }
           // System.out.println(i+1+" ");
            for (int k=1; k<i+1; k++){
                System.out.print(k+" ");
            }
            for (int k1=1; k1<=i-1; k1++){
                System.out.print(i-k1+" ");
            }
            System.out.println("  ");
        }

    }}
public class problem_04 {
    public static void main(String[] args) {
        pyramid py = new pyramid();
        py.pettern();
    }
}
