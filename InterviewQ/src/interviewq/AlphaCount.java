/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewq;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author Akanksha
 */
public class AlphaCount
{ 
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String a = "aaaabb";
        int n=a.length();
        int count=0;
        for(int i=0;i<n-1;i++)
        {             
             if(a.charAt(i)==a.charAt(i+1))
                 count++;
             else
             {
                 System.out.print(a.charAt(i));
                 System.out.print(++count);
                 count=0;   
             }       
        }
        if(a.charAt(n-1)==a.charAt(n-1))
        {
        System.out.print(a.charAt(n-1));
        System.out.print(++count);
        }
        else
        {
        System.out.print(a.charAt(n-1));
        System.out.print("1");
        }
    }
}