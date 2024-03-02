package org.example.MiscProblems;
// find sum of n natural numbers

public class FindSum {
    static int findSum(int n){
        return n * (n+1)/2;
    }

    public static void main(String[] args) {
        System.out.println(FindSum.findSum(99999));
    }
}
