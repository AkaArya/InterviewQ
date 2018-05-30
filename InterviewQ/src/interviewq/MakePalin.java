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
public class MakePalin {
    
    public static void main(String args[])
    {
    String a="abcdefg";
    int m=a.length();
    
        for(int i=m/2;i<=m-1;i++)
        { 
            
             if(a.charAt(i)!=a.charAt(m-1-i))
             {
                 
                 System.out.print(a.charAt(m-1-i));
             }
             
        }
}
}
        
    

