/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcodesinnovations.heapsort;

/**
 *
 * @author sirch
 */
public class Data {
   private final Number[] array;
   private int largestAvailableIndex;
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
