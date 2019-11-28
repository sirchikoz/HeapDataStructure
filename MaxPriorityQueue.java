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
public class MaxPriorityQueue extends PriorityQueue{
    private final HeapDataStructure heap = new HeapDataStructure();       
    public MaxPriorityQueue(Data data){
        super(data);
         heap.buildMaxHeap(data);
    }
    public Number extractMax(Data data){
        Number max = 0;
        if(data.getLargestAvailableIndex() >= 0){
            max = data.getElements()[0];
            data.getElements()[0] = data.getElements()[data.getLargestAvailableIndex()];
            data.setLargestAvailableIndex(data.getLargestAvailableIndex() - 1);
            heap.MaxHeapify(data, 0);
        }
        return max;
    }
    public void increaseKey(Data data, int index, Number key){
        if(key.doubleValue() > data.getElements()[index].doubleValue()){
            data.getElements()[index] = key;
            while(index >= 0 && data.getElements()[heap.getParent(index)].doubleValue() < data.getElements()[index].doubleValue()){
                Number temp =  data.getElements()[index];
                data.getElements()[index] = data.getElements()[heap.getParent(index)];
                data.getElements()[heap.getParent(index)] = temp;
            }
        }
    }
    public void insert(Data data, Number key){
        if(data.getLargestAvailableIndex() < (data.getElements().length - 1)){
            data.setLargestAvailableIndex(data.getLargestAvailableIndex() + 1);
            data.getElements()[data.getLargestAvailableIndex()] = Integer.MIN_VALUE;
            increaseKey(data,data.getLargestAvailableIndex(),key);
        }
    }
}
