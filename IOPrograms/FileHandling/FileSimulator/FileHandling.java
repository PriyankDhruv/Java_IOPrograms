package FileHandling.FileSimulator;
import java.io.*;
import java.util.*;
import FileHandling.FileReading.*;
import FileHandling.WritingToFile.*;

class FileHandling{
	
	public static void main(String args[]) throws FileNotFoundException,IOException{
		
		FileHandling Fh = new FileHandling();
		FileReading Fr = new FileReading();
		WritingToFile Wtf = new WritingToFile();
		while(true){
			
            System.out.println("\n***** File-Simulator *****\n");
		    System.out.println("r : read-mode");
		    System.out.println("w : write-mode");
		    System.out.println("a : append-mode");
		    System.out.println("x : exit");
			System.out.println("\nActivate any One File-Operation given Below : ");
			DataInputStream In = new DataInputStream(System.in);
		    String Str = In.readLine();
		    if(Str.equalsIgnoreCase("r")){
			
			    new FileReading();
		
		    }else if(Str.equalsIgnoreCase("w") || Str.equalsIgnoreCase("a")){
				
			    Wtf.FileWriting(Str);
			
			}else if(Str.equalsIgnoreCase("x")){
				
				System.exit(0);
					
		    }else{

			    System.out.println("Invalid Choice of Activation !! try it Again.");
				
			}
			
		}

	}

}	