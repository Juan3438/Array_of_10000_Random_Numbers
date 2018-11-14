package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[10000];
	    for(int i = 0; i < 10000; i++){
	        int num = ThreadLocalRandom.current().nextInt(0, 10000 + 1);
	        arr[i] = num;
        }
        System.out.println(arr[2000]);
    }
}
