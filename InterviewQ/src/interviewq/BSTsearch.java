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

 public class BSTsearch {
  class N {
        int key;
        N left, right; 
        public N(int item) {
            key = item;
            left = right = null;
        }
    }
    N root;
   // Constructor
    BSTsearch() { 
        root = null; 
    }
    void insert(int key) {
       root = insertRec(root, key);
    }     
    /* A recursive function to insert a new key in BST */
    N insertRec(N root, int key) { 
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new N(key);
            return root;
        } 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
 
 
       
    // This method mainly calls InorderRec()
    void inorder()  {
       inorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void inorderRec(N root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    
    void deleteKey(int key)
    {
        root = deleteRec(root, key);
    }
 
    /* A recursive function to insert a new key in BST */
    N deleteRec(N root, int key)
    {
        /* Base Case: If the tree is empty */
        if (root == null)  return root;
 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
 
        // if key is same as root's key, then This is the node
        // to be deleted
        else
        {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
 
            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.key = minValue(root.right);
 
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }
 
        return root;
    }
 
    int minValue(N root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
    
    
     void searchOut(int key)
     {
         search(root,key);
     }
     void search(N root, int key)
{
    // Base Cases: root is null or key is present at root
    if (root==null || root.key==key)
    {System.out.println("YES"); }
    
 
    // val is greater than root's key
    else if (root.key > key)
    search(root.left, key);
    else
    // val is less than root's key
     search(root.right, key);
}
     void h()
     {
         int hh=height(root);
         System.out.println(hh);
     }
     static int height(N root) {
      	// Write your code here.
        if(root==null)
            return -1;
        else
            return 1+Math.max(height(root.left),height(root.right));
        
    } 
    // Driver Program to test above functions
    public static void main(String[] args) {
        BSTsearch tree = new BSTsearch();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        // print inorder traversal of the BST
        tree.inorder();
        System.out.println("Searching..");
        tree.searchOut(40);
        
        tree.deleteKey(30);
        tree.inorder();
        
        tree.h();
    }
}