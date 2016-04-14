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
public class Hacker_rank_algo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int size=input.nextInt();
       int sum=0;
       int[] arr=new int[size];
       for(int i=0;i<arr.length;i++){
           arr[i]=input.nextInt();
       }
       for(int j=0;j<arr.length;j++){
           sum+=arr[j];
       }
       System.out.println(sum);
       
        
    }
    
}
