package er_data;

import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class ERDataReader {
	public static int[][][] readData(String dataFile) throws FileNotFoundException, NoSuchElementException, IllegalStateException  {	

		final int NUM_WEEKS = 4;
		final int NUM_DAYS = 7;
		final int NUM_HOURS = 24;
		
		int[][][] data = new int [NUM_WEEKS][NUM_DAYS][NUM_HOURS];
		
		 Scanner in = new Scanner(new FileReader(dataFile));
		 
		 for (int week = 0; week < NUM_WEEKS; week++){ 
		   for (int day = 0; day < NUM_DAYS; day++){
			 for (int hour = 0; hour < NUM_HOURS; hour++){
				 data[week][day][hour] = in.nextInt(); 
			 }
		 }
		 
	   }
		 in.close();
		 return data;
	}
}
