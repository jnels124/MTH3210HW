import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;



/**
 * Write a description of class Setup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brain {
    private Object [] answers;
    final private int maxObservations = 50;

    /**
     * Constructor for objects of class Setup
     */
    public Brain () {
       
    }

    final double findMean ( final double population[] ) {
        double sum = 0;
        for ( int i = 0; i < population.length; i++ ) {
            sum += population[i];
        }   
        
        return sum / population.length;
    }
    
    final double findStandardDeviation ( final double population[], final double mean ) {
        double runningTotal = 0;
        double variance;
        double stdDev;
        for ( int i = 0; i < population.length; i++ ) {
            // Square each value of the population - mean
            runningTotal += ( Math.pow( population[i] - mean, 2 ) );
        }
        variance = runningTotal / ( population.length - 1 );
        stdDev = Math.sqrt( variance );
        
        return stdDev;
    }
    
    /** Pre condition - Array as parameter must be sorted from lowest to highest 
     * 
     */
    final double [] findFiveNumberSummary ( final double population[] ) {
        double min;
        double lowerQuartile;
        double median;
        double upperQuartile;
        double max;
        
        min = population[0];
        median = findMedian( population );
        max = population[population.length - 1];
        
        int i = 0;
        while ( population[i] <= median ) i++;
        
        /*if( population % 2 == 0 ) {                                         // i + 1 not included 
            lowerQuartile = findMedian( Arrays.copyOfRange( population, 0, i + 1 ) );
            upperQuartile = findMedian( Arrays.copyOfRange( population, i + 1, population.length ) );
        } else {
            lowerQuartile = findMedian( Arrays.copyOfRange( population, 0, i ) );
            upperQuartile = findMedian( Arrays.copyOfRange( population, i + 1, population.length ) );
        } */
        lowerQuartile = ( ( population.length % 2 ) == 0 ) 
                          ?
                          findMedian( Arrays.copyOfRange( population, 0, i + 1 ) )
                          :
                          findMedian( Arrays.copyOfRange( population, 0, i ) );
        upperQuartile = findMedian( Arrays.copyOfRange( population, i + 1, population.length ) );  
        
        double summary[] = { min, lowerQuartile, median, upperQuartile, max };
        
        return summary;
    }
    
    final double findMedian ( double population[] ) {
        double median;
        if ( population.length % 2 == 0 ) {
            int lowMedian = ( population.length / 2 ) - 1;
            int highMedian = population.length / 2  ;
            median = ( population[lowMedian] +
                       population[highMedian] ) 
                       / 2;
        } else { 
            median = population[population.length / 2];
        }
        return median;
    } 
    
    final double [] percentageOfFallingWithin1_2_3StdDev () {
        
        return new double[7];
    } 
    
    final void frequencyTable () {
        
    } 
    
    final void relativeFrequencyTable () {
        
    }
    
    final void relativeFrequencyHistogram () {
        
    }
    
    final void boxPlot () {
    }
}
