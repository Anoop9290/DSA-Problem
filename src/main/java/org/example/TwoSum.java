package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static void main() {
                 //0,1,2,3,4,5,6,7,8,9
        int[] arr={1,4,2,3,6,8,9,2,4,5};
        int target=7;
        Map<Integer,Integer> hasmap=new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){

            int complement=target-arr[i];

            if(hasmap.containsKey(complement)){
                int[] an=new int[] { hasmap.get(complement),i};
                System.out.println(hasmap.get(complement)+","+i);
            }
            else {
                hasmap.put(arr[i], i);
            }


        }
    }




}
