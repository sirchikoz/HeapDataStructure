
package com.tcodesinnovations.heapsort;

/**
 *
 * @author sirch
 */
public class TestMain {
    public static void main(String[] args){
        Float[] nums = {34f,2f,64f,2f,21f,3f,6f,9f,1f,90f};
        Data data = new Data(nums);
        HeapSort sort = new HeapSort(data);
        //sort.sort();
         sort.sortDecreasingOrder();
        for(int i=0; i<nums.length;i++){
            System.out.println(nums[i]);
        }
        
         Float[] maxs = {34f,2f,564f,2f,21f,3f,6f,9f,1f,90f};
         data = new Data(maxs);
         MaxPriorityQueue queue = new MaxPriorityQueue(data);
         System.out.println("Maximum Values:"+queue.extractMax(data));
         queue.increaseKey(data, 0, 500f);
         System.out.println("Maximum Values:"+queue.extractMax(data));
    }
}
