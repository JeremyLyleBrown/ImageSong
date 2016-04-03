import java.io.File;
import java.util.List;

import com.clarifai.api.ClarifaiClient;
import com.clarifai.api.RecognitionRequest;
import com.clarifai.api.RecognitionResult;
import com.clarifai.api.Tag;
/**
 * This class creates a GetTag object. The class contains a public List<RecognitionResult> getTheTags(String filePath)
 * method that takes in a file path as a string as an argument and returns the "tags" assigned by Clarifai 
 * in the format of an array 
 * @author kelly
 *
 */


public class GetTag {

	/**
	 * Default Constructor
	 * @author kelly
	 *
	 */
	public GetTag(){
		
	}
	
	/**
	 * Takes in a file path as a string as an argument and returns the "tags" assigned by Clarifai 
	 * in the format of an array 
	 * @param filePath the file path of the file
	 * @return the "tags" assigned by Clarifai in the format of an array 
	 */
	public List<RecognitionResult> getTheTags(String filePath){
		
        ClarifaiClient clarifai = new ClarifaiClient("ZRNHMLnOHeCHCeoLXV9PsdJqHI8hMZ967l181QVm", "3xIo8cayHGavrmNgWz2BJ8q5007OBSckj2U59P95");
       
        List<RecognitionResult> results =
                clarifai.recognize(new RecognitionRequest(new File(filePath)));

        //print stuff
        /*
        for (Tag tag : results.get(0).getTags()) {
            System.out.println(tag.getName()) + ": " + tag.getProbability());
        }
        */
        
		return results;
	}
	
	
}
