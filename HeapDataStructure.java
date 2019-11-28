
package com.tcodesinnovations.heapsort;

/**
 *
 * @author sirch
 */
public class HeapDataStructure {
    /**
     * This method creates a heap with the root being the largest value
     * @param data 
     */
    public void buildMaxHeap(Data data){
        data.setLargestAvailableIndex(data.getElements().length - 1);
        for(int i = Math.floorDiv(data.getElements().length, 2); i >= 0 ; i--)           
            MaxHeapify(data,i);
    }
    /**
     * This method creates a heap with the root being the smallest value
     * @param data 
     */
    public void buildMinHeap(Data data){
        data.setLargestAvailableIndex(data.getElements().length - 1);
        for(int i = Math.floorDiv(data.getElements().length, 2); i >= 0 ; i--)           
            MinHeapify(data,i);
    }
    /***
     * This method makes the index point to the maximum value of a subtree
     * @param data
     * @param index 
     */
    public void MaxHeapify(Data data, int index)
    {
        int l = getLeftChild(index);
        int r = getRightChild(index);
        int largest = 0;
        if(l <= data.getLargestAvailableIndex() && data.getElements()[l].doubleValue() > data.getElements()[index].doubleValue())
            largest = l;
        else
            largest = index;
        if(r <= data.getLargestAvailableIndex() && data.getElements()[r].doubleValue() > data.getElements()[largest].doubleValue())
            largest = r;
        if (largest!= index)
        {
            Number temp = data.getElements()[index];
            data.getElements()[index] = data.getElements()[largest];
            data.getElements()[largest]= temp;
            MaxHeapify(data,largest);
        }
    }
    /**
     * TThis method makes the index point to the minimum value of a subtree
     * @param data
     * @param index 
     */
    public void MinHeapify(Data data, int index)
    {
        int l = getLeftChild(index);
        int r = getRightChild(index);
        int smallest = 0;
        if(l <= data.getLargestAvailableIndex() && data.getElements()[l].doubleValue() < data.getElements()[index].doubleValue())
            smallest = l;
        else
            smallest = index;
        if(r <= data.getLargestAvailableIndex() && data.getElements()[r].doubleValue() < data.getElements()[smallest].doubleValue())
            smallest = r;
        if (smallest!= index)
        {
            Number temp = data.getElements()[index];
            data.getElements()[index] = data.getElements()[smallest];
            data.getElements()[smallest]= temp;
            MinHeapify(data,smallest);
        }
    }
    public int getParent(int i){
        return Math.floorDiv(i, 2);
    }
    /***
     * Return the index of the left child
     * @param i
     * @return 
     */
    private int getLeftChild(int i){
        return 2*i;
    }
    /***
     * Returns the index of the right child
     * @param i
     * @return 
     */
        private int getRightChild(int i){
        return 2*i + 1;
    }
}
