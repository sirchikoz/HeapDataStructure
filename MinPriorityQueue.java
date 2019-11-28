package com.tcodesinnovations.heapsort;

/**
 *
 * @author sirch
 */
public class MinPriorityQueue extends PriorityQueue{
     private final HeapDataStructure heap = new HeapDataStructure();       

    public MinPriorityQueue(Data data) {
        super(data);
        heap.buildMinHeap(data);
    }
     
        public Number extractMin(Data data){
        Number min = Integer.MIN_VALUE;
        if(data.getLargestAvailableIndex() >= 0){
            min = data.getElements()[0];
            data.getElements()[0] = data.getElements()[data.getLargestAvailableIndex()];
            data.setLargestAvailableIndex(data.getLargestAvailableIndex() - 1);
            heap.MinHeapify(data, 0);
        }
        return min;
    }
    public void decreaseKey(Data data, int index, Number key){
        if(key.doubleValue() < data.getElements()[index].doubleValue()){
            data.getElements()[index] = key;
            while(index >= 0 && data.getElements()[heap.getParent(index)].doubleValue() > data.getElements()[index].doubleValue()){
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
            decreaseKey(data,data.getLargestAvailableIndex(),key);
        }
    }
}
