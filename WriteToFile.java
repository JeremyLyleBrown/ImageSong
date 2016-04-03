import java.io.*;
import java.util.List;

import com.clarifai.api.RecognitionResult;
import com.clarifai.api.Tag;

/**
 * This Class creates a WriteToFile object. This class contains a public void writeIt(List<RecognitionResult> results)
 * method that takes the list of tags from Clarafai and writes it to a file
 * @author kelly
 *
 */
public class WriteToFile {

	/**
	 * Default Constructor
	 */
	public WriteToFile(){
		
	}
	
	/**
	 * Takes the list of tags from Clarafai and writes it to a file
	 * @param results the list of tags from Clarafai
	 */
	public void writeIt(List<RecognitionResult> results){
		//the name of the file to open
		//have to put the path for the file
		
				String fileName = ""; //change this to the actual path of a file

				try{
					//FileReader reads text files in the default encoding
					FileWriter  fileWriter =  new FileWriter(fileName);
					
					BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
					
			        for (Tag tag : results.get(0).getTags()) {
			        	bufferedWriter.write(tag.getName() + ",");
			        }

					bufferedWriter.close();
				}

				catch(IOException ex){
					System.out.println("Error writing to file '" + fileName + "'");
				}
	}
	

}
