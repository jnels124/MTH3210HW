import java.io.*;
import java.util.*;

public class QuickSort {
    private static void swap ( int population[], int thisInt, int  thatInt ) {
        int temp = population[thisInt];
        population[thisInt] = population[thatInt];
        population[thatInt] = temp;
    }

    // Reorganizes the given list so all elements less than the first are 
    // before it and all greater elements are after it.                   
    private static int partition( int population[], int first, int last ) {
        int pivot = population[first];
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