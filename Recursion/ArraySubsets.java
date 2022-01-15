package com.dsapackage.Recursion;

import java.util.ArrayList;
import java.util.List;

public class ArraySubsets
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(subSet(arr));
    }

    static List<List<Integer>> subSet(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr)
        {
            int n = outer.size();
            for (int i = 0; i < n; i++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
