package seleniumjava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class TextFileManager {

	public static void main(String[] args) {
		//Using a relative path,just like the Excel Example
		String filename="AutoTextFile.txt";
		Path path=Paths.get(filename);
		
		//1.Writing Data (Creates the file or Overwrites it if it exists)
		try {
			//prepare lines of text to write
			List<String> linesToWrite =List.of(
				"Username: Kishore",
				"Password: Secret123",
				"Role: System Adminstrator"
					
			);
			//Write all lines at once
			Files.write(path,linesToWrite);
			System.out.println("Text file Written successfully at:"+ path.toAbsolutePath());
			 // Optional: How to APPEND data to an existing file instead of overwriting
            Files.writeString(path, "\nLast Login: " + java.time.LocalDate.now(), StandardOpenOption.APPEND);

			
		}catch(IOException e)
		{
			System.err.println("Error writing to file: "+e.getMessage());
		}
		
		System.out.println("----------------------------------------------");
		try {
			
			if(Files.exists(path)) {
				//Read all lines from the file into a List
				List<String> alllines=Files.readAllLines(path);
				System.out.println("Reading content from "+filename+ ":\n");
				for(String line:alllines) {
					System.out.println(line);
				}
				
				}
			else {
				System.out.println("File Not Found");
			}
		}catch(IOException e) {
			System.err.println("Error reading from file: "+e.getMessage());
		}
	}

}
