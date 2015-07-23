/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarray;

/**
 *
 * @author ikramlim
 */
public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double[] a = {1.9, 2.9, 3.4, 3.5,10.0};
        
        //paparkan semua array nombor
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i] + "");
        }
        
        //paparkan jumlah nombor yg diberikan.
        double total = 0;
        
        for (int i = 0; i < a.length; i++)
        {
            total += a[i]; //jumlah i adalah 21.7
        }
        System.out.println("Total is : " + total);
        
        //paparkan nomber yg besar dlm array
        
        double max = a[0];
        for (int i = 1; i< a.length; i++)
        {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Max number is : " + max);
        
        double min = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Min number is : " + min);
    }
    
}
