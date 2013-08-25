import java.net.URL;

public class Main {
	public static void main ( String [] args ) {
		Brain HW1 = new Brain();
		URL filePath = Main.class.getClassLoader().getResource("observations.txt");
		HW1.readObservationsFile( filePath.getFile() );
	}

}
