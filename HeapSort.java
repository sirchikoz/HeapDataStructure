
package com.tcodesinnovations.heapsort;

/**
 *
 * @author sirch
 */
public class HeapSort {
    private Data data;
    public HeapSort(Data data){
        this.data = data;
    }
    public void sort()
    {
        HeapDataStructure heap = new HeapDataStructure();
        heap.buildMaxHeap(data);
         for(int i = data.getElements().length-1 ; i >= 1 ; i--) 
         {
            Number temp = data.getElements()[0];
            data.getElements()[0] = data.getElements()[i];
            data.getElements()[i]= temp;
            data.setLargestAvailableIndex(data.getLargestAvailableIndex()-1);
            heap.MaxHeapify(data,0);
         }
        
    }
    public void sortDecreasingOrder()
    {
        HeapDataStructure heap = new HeapDataStructure();
        heap.buildMinHeap(data);
         for(int i = data.getElements().length-1 ; i >= 1 ; i--) 
         {
            Number temp = data.getElements()[0];
            data.getElements()[0] = data.getElements()[i];
            data.getElements()[i]= temp;
            data.setLargestAvailableIndex(data.getLargestAvailableIndex()-1);
            heap.MinHeapify(data,0);
         }
        
    }
}
