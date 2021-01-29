package com.example.DSA;

import java.util.Arrays;

public class TrainDemo {

    public static void main(String[] args) {
         double arr[]={9,9.40,9.50,11,15,18};
         double dep[]={9.10,12,11.20,11.30,19,20};

         Arrays.sort(arr);
         Arrays.sort(dep);
         int counter=1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<dep.length;j++){
                if(arr[i+1]<arr[j]){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
