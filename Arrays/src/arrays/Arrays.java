/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Lenovo
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myIntArray=new int[25];//{1,2,3,4,5,6,7,8,9}
        for(int i=0;i<myIntArray.length;i++){
            myIntArray[i]=i*10;
            
        }
        for(int i=0;i<myIntArray.length;i++){
            System.out.println("Element"+i+" value is "+myIntArray[i]);
        }
            
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element"+i+",value is "+array[i]);
        }
    }
    
}
