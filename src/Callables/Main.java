package Callables;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> listToSort = List.of(5,2,3,4,1,6,7);
        //newCachedThreadPool -- it allocates thread number on its own
        ExecutorService executorService = Executors.newCachedThreadPool();


        MergeSorter mergeSorter = new MergeSorter(listToSort, executorService);

        Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);
        List<Integer> sortedList = sortedListFuture.get();
        System.out.println(sortedList);
    }
}
