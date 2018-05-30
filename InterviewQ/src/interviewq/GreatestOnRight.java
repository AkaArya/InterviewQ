/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewq;

/**
 *
 * @author Akanksha
 */
public class GreatestOnRight {
    
   static void rearrange(int a[],int n)
    {
        
        for(int i=0;i<n-1;i++)
        {
            int k=i;
            
            while(a[k]<a[k+1])
            {
                if(k+1<n-1)
                k++;
                else
                    break;        
            }
            for(int j=i;j<k;j++)
                a[j]=a[k];
            i=k;
            }
                
        }
    
     public static void main(String args[])
     {
         int a[]={1,2,3,7,6,9,0,4,5,10};
         int n=a.length;
         rearrange(a,n);
         for(int i=0;i<n;i++)
         {
             System.out.print(a[i]);
         }
     }
}
