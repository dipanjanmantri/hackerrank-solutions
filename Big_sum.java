/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacker_rank_algo;

import java.util.Scanner;

/**
 *
 * @author Diphanjan
 */
public class Big_sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long sum=0;
        int size=input.nextInt();
        long[] arr=new long[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
        }
        System.out.println(sum);
        
    }
    
}
