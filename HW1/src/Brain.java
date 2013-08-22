import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;




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
    
    final ArrayList<Double> readObservationsFile ( final String fileName ) {
    	ArrayList<Double> observations = new ArrayList<Double>();
    	String currentLine;
    	try { 
    		Scanner inFile = new Scanner ( new FileReader ( fileName ) );
    		while ( inFile.hasNext() ) {
    			currentLine = inFile.nextLine();
    			observations.add( Double.parseDouble( currentLine ) );
        	}
    	} catch( FileNotFoundException e ) {
    		System.out.println( "File Not found" );
    	} catch( Exception e ) {
    		System.out.println( "!!!!!ERROR!!!!!\nUnkown exception occured");
    	}
    	
        return observations;
    }

    final double findMean ( final ArrayList<Double> population ) {
    	double sum = 0;
    	for ( int i = 0; i < population.size(); i++ ) {
    		sum += population.get( i );
    	}	
    	
        return sum / population.size();
    }
    
    final double findStandardDeviation ( final ArrayList<Double> population, final double mean ) {
    	double runningTotal = 0;
    	double variance;
    	double stdDev;
    	for ( int i = 0; i < population.size(); i++ ) {
    		// Square each value of the population - mean
    		runningTotal += ( Math.pow( population.get( i ) - mean, 2 ) );
    	}
    	variance = runningTotal / population.size();
    	stdDev = Math.sqrt( variance );
    	
        return stdDev;
    }
    
    final void findFiveNumberSummary ( final ArrayList<Double> population ) {
    	final ArrayList<Double> sortedPopulation = sortPopulation( population ); 
    }
    
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
    private ArrayList<Double> sortPopulation ( ArrayList<Double> population,
    										   ArrayList<Double> sorted 
    										 ) {
    	ArrayList<Double> lowerHalf = new ArrayList<Double>();
    	ArrayList<Double> upperHalf = new ArrayList<Double>();
    	Random rand = new Random( population.size() ) ;
    	if ( population.size( ) <= 1 ) {
    		return sorted;
    	}
    	int pivot = rand.nextInt();
    	
    	return null;
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
