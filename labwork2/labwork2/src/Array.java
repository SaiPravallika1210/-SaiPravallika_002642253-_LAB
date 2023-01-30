/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author balin
 */
public class Array {
    public static void main(String[] args){
        int[] array={7,2,8,23,4};
        for( int i=0; i< array.length; i++){
            if(i%2==0)
            {
                array[i]=array[i]*2;
            }
            else{
                array[i]=array[i]*3;
            }
            System.out.println(array[i]);
        }
    }
    
}
