package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++) {

            for(int k = cathetusLength; k >= 2; k--) {
                if(k <= i) {
                    System.out.print(k);
                } else {
                    System.out.print(" ");
                }
            }





            for(int j = 1; j <= cathetusLength; j++) {
                if(j <= i ) {
                    System.out.print(j);
                }
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
