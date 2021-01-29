package com.example.DSA;

import java.util.*;

public class TestDemo {

    //array of number=[1,1,1,2,2,3,3,3,3,4,5,5,5,5,5], k = 1

    //O(n log n) O(n)

    public static void main(String[] args) {
        int arr[] ={1,1,1,2,2,3,3,3,3,4,5,5,5,5,5,-1,-1,-1};
        int arr1[] = new int[arr.length];

        int k=3;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue()>o2.getValue()){
                    return -1;
                }else if(o1.getValue()<o2.getValue()){
                    return 1;
                }else{
                    return 0;
                }
            }
        });

        for(int i=0;i<k;i++){
            System.out.println(list.get(i));
        }
    }
}
