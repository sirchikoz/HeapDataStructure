
package com.tcodesinnovations.heapsort;

/**
 *
 * @author sirch
 */
public class Data {
   private final Number[] array;
   private int largestAvailableIndex;//This points to the last index in the array of the available elements
   public Data(Number[] array){
       this.array = array;
       largestAvailableIndex = array.length - 1;
   } 
   public void setLargestAvailableIndex(int num){
       largestAvailableIndex = num;
   }
   public int getLargestAvailableIndex(){
       return largestAvailableIndex;
   }
   public Number[] getElements(){
       return array;
   }
}
