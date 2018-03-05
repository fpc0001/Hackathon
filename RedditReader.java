import java.io.BufferedReader;
import java.io.FileReader;

public class RedditReader {


		RedditReader () {
		//Default construct	
		}
public void readInTXT(String fileToRead, String checkFor, String checkFor1) {
	
	try {
	System.out.println("Importing: " + fileToRead);
	FileReader myFileReader = new FileReader(fileToRead);
	System.out.println("Success!");
	
	BufferedReader myBufferedReader = new BufferedReader(myFileReader);
	System.out.println("Ready to Buffer: " + fileToRead);
	
	String line=myBufferedReader.readLine();
	int counter= 1;
	int checkCount= 0;
	
	while (line != null) {
		
		if (detectRussia(line, checkFor, checkFor1) == true) {
			
		System.out.println("Line" + counter + ": " + line);
		line= myBufferedReader.readLine();
		detectRussia(line, checkFor, checkFor1);
		
		counter= counter + 1;
		checkCount= checkCount + 1;
		
		}else
			line= myBufferedReader.readLine();
			counter= counter + 1;
	}
	
	
	System.out.println("\n" + fileToRead + " Buffered Successfully!");
	System.out.println("Number of lines containing " + checkFor + ": " + checkCount);
	}
	catch (Exception ex)
	{
		System.out.println("Error: File Not Found");
	}
	}

	boolean detectRussia(String lineToCheck, String checkFor, String checkFor1) {
		
		String lineToCheckLowercase= lineToCheck.toLowerCase();
			
		if (lineToCheckLowercase.contains(checkFor) && lineToCheckLowercase.contains(checkFor1)) {
			System.out.println("Detected " + checkFor + " / " + checkFor1);
			return true;
			
		} else {
			//System.out.println("Desired string not detected");
			return false;
		}
			
	}		
	
}

	
