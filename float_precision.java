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
public class float_precision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double v=12;
        double c1=0,c2=0,c3=0;
        //System.out.println(String.format("%.6f", v));
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
            
        }
        for(int j=0;j<size;j++){
            if(arr[j]>0)
                c1+=1;
            if(arr[j]<0)
                c2+=1;
            if(arr[j]==0)
                c3+=1;
        
        }
        c1/=size;
        c2/=size;
        c3/=size;
        System.out.println(String.format("%.4f", c1));
        System.out.println(String.format("%.4f", c2));
        System.out.println(String.format("%.4f", c3));
        
        
        
    }
    
}
