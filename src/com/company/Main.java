package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            block1: {
                block2: {
                    block3: {
                        System.out.println("\ni равно " + i);
                        if (i == 1) break block1;
                        if (i == 2) break block2;
                        if (i == 3) break block3;
                        System.out.println("Эта строка никогда не будет напечатана");
                    }
                    System.out.println("завершен Блок3");
                }
                System.out.println("завершен Блок2");
            }
            System.out.println("завершен Блок1");
        }
        System.out.println("конец цикла for");
    }
}
