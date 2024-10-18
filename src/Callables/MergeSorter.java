package Callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> listToSort;
    ExecutorService executorService;

    //constructor
    public MergeSorter(List<Integer> listToSort, ExecutorService executorService){
        this.listToSort = listToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        // mergeSort Logic

        int size = listToSort.size();
        if(size <= 1){
            return listToSort;
        }

        List<Integer> leftHalf = new ArrayList<>();
        List<Integer> rightHalf = new ArrayList<>();

        for(int i = 0 ; i < size/2; i++){
            leftHalf.add(listToSort.get(i));
        }
        for(int i = size/2 ; i < size; i++){
            rightHalf.add(listToSort.get(i));
        }

        // sort lefthalf and righthalf in seperate threads

        MergeSorter leftMergeSorter = new MergeSorter(leftHalf, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightHalf, executorService);

        //ExecutorService executorService = Executors.newCachedThreadPool();

        // future helps to execute these two lines parallely in separate thread
        Future<List<Integer>> leftSortedListFuture = executorService.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedListFuture = executorService.submit(rightMergeSorter);

        // Merge -- for merging we need both left and right, so we are using blockers
        List<Integer> leftSortedList = leftSortedListFuture.get(); //blocking/ waiting call
        List<Integer> rightSortedList = rightSortedListFuture.get();

        int i = 0, j = 0;
        List<Integer> sortedList = new ArrayList<>();

        while(i < leftSortedList.size() && j < rightSortedList.size()) {
            if (leftSortedList.get(i) < rightSortedList.get(j)) {
                sortedList.add(leftSortedList.get(i));
                i++;
            } else {
                sortedList.add(rightSortedList.get(j));
                j++;
            }
        }

        while (i < leftSortedList.size()) {
            sortedList.add(leftSortedList.get(i));
            i++;
        }

        while (j < rightSortedList.size()) {
            sortedList.add(rightSortedList.get(j));
            j++;
        }

        return sortedList;

    }
}
