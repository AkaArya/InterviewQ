/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewq;
 import java.util.*;
import java.io.*;
/**
 *
 * @author Akanksha
 */
public class Array {
    
    public static void rotate(int[] arr,int n, int d)
    {
        int r=n-d;
        for(int i=r;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        for(int i=0;i<r;i++)
        {
            System.out.print(arr[i]);
        }
    }
    
    public static void reverse(int[] arr,int n, int d)
    {
        while(n<d)
        {
            int t=arr[n];
            arr[n]=arr[d];
            arr[d]=t;
            n++;
            d--;
        }
        for(int i=0;i<11;i++)
        {
            System.out.print(arr[i]);
        }
    }
    
    public static void main(String args[])
    {
//       Scanner sc= new Scanner(System.in);
//        int m= sc.nextInt();
//        System.out.print(m);
//        int[] arr = new int[n];
//        
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=sc.nextInt();
//        }
         int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        //System.out.printf("Modified arr[] : %s",
                          //Arrays.toString(arr));
        //reverse(arr,0,n-1);
    }
    
}
