import java.io.*;
import java.util.*;

/* 
     * The steps are:
     * Pick an element, called a pivot, from the list.
     * Reorder the list so that all elements with values 
     * 	less than the pivot come before the pivot, while all 
     * 	elements with values greater than the pivot come after 
     * 	it (equal values can go either way). After this partitioning, 
     * 	the pivot is in its final position. This is called the partition operation.
     * Recursively apply the above steps to the sub-list of elements with smaller values 
     * 	and separately the sub-list of elements with greater values.
     * 
     * This is a quick sort algorithm. Not the best but it is easy to implement.
     * */

public class QuickSort {
    private static void swap ( int population[], int thisInt, int  thatInt ) {
        int temp = population[thisInt];
        population[thisInt] = population[thatInt];
        population[thatInt] = temp;
    }

    // Reorganizes the given list so all elements less than the first are 
    // before it and all greater elements are after it.                   
    private static int partition( int population[], int first, int last ) {
        Random rand = new Random( population.length - 1 );
        int pivot = population[ rand.nextInt() ];
        while ( first < last ) {
            if ( population[first] == pivot || population[last] == pivot ) {
                
            }
            while ( population[first] < pivot ) first++;
            while ( population[last] > pivot ) last--;
            swap ( population, first, last );
        }
        return first;
    }

    public static void Quicksort( int population[], int first, int last ) {
        if ( first >= last ) return;
        int pivot_index = partition( population, first, last );
        Quicksort( population, first, pivot_index );
        Quicksort( population, pivot_index+1, last );
    }
    
}