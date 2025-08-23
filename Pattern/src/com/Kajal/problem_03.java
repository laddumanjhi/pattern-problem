package com.Kajal;

class number{
    void pettern(){
        int num =5;
        for (int i=1; i<=num; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("  ");
        }
    }
}
public class problem_03 {
    public static void main(String[] args) {
   number nu=new number();
   nu.pettern();
    }
}
