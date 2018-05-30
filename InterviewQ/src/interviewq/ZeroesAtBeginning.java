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

 
 
class ZeroesAtBeginning
{
    static void pushZeros(int arr[], int n)
    {
        int count = n-1;  // Count of non-zero elements
 
        for (int i = n-1; i >= 0; i--)
            if (arr[i] != 0)
            {arr[count--] = arr[i];
            //System.out.println(count);
            }
                 
        while (count >= 0)
        {arr[count--] = 0;
        //System.out.println(count);
        }
     
    }
 
    
    public static void main (String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZeros(arr, n);
       
        System.out.println("Array after pushing zeros ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}