import java.net.URL;
import java.util.*;
import java.io.FileReader;

public class Main {
	public static void main ( String [] args ) {
		Brain HW1 = new Brain();
		URL filePath = Main.class.getClassLoader().getResource("observations.txt");
		ArrayList<Double> observations = new ArrayList<Double>();
    	String currentLine;
    	try { 
    		Scanner inFile = new Scanner ( new FileReader ( filePath.getFile() ) );
    		while ( inFile.hasNext() ) {
    			currentLine = inFile.nextLine();
    			observations.add( Double.parseDouble( currentLine ) );
        	}
    	} catch( FileNotFoundException e ) {
    		System.out.println( "File Not found" );
    	} catch( Exception e ) {
    		System.out.println( "!!!!!ERROR!!!!!\nUnkown exception occured" );
    	}
	}

}
