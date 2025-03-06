package packageDay10;

import java.io.IOException;
import java.io.*;

public class FileExample1 {

	public static void main(String[] args) throws IOException{


		try {
			
			
			File file = new File("R:\\File\\HeyThere.txt");
			
			System.out.println("Is file is there in disk: "+file.exists());
            System.out.println("Does file exist before creation? " + file.exists());

            if (file.createNewFile()) {
                System.out.println("File was newly created.");
            } else {
                System.out.println("File already existed.");
            }

            
            //Make Directory 
            
            
		
		
		} catch (IOException e) {
			System.out.println("Something is wrong 😥");
		}
	}

}
