package FileHandling.WritingToFile;
import java.io.*;
import java.util.*;

public class WritingToFile{   
	
	public static void FileWriting(String Str){
	
	    Scanner In = null;
	    try{
		
		    String Source = new String("");
		    File f = new File("F:/abc/Jhanvi.txt");
		
		    BufferedReader Bfr = new BufferedReader(new InputStreamReader(System.in));
		    FileWriter Fw = null;
			if(Str.equalsIgnoreCase("w")){
				
				Fw = new FileWriter(f,false);
				System.out.println("Hi Jhanvi !! Now, i will Overwrite the Content of the file.");
		        System.out.println("Note  : Type 'No' to Exit from file");
				System.out.println("        If you want to Proceed : Type 'Yes'");
				
				In = new Scanner(System.in);
				String s = In.nextLine();
				if(s.equals("No")){
					
					System.exit(0);
					
				}
				System.out.println("Note-2 : Write 'Stop' when you finish Writing your file");
				f.delete();
				f.createNewFile();
				while(!(Source = Bfr.readLine()).equals("Stop")){
					
					Fw.write(Source + System.getProperty("line.separator"));
					
				}
                 
				System.out.println("Thanks Jhanvi !! Your File Written Successfully."); 
				In.close();
				
			}else{

				Fw = new FileWriter(f,true);
				System.out.println("Write 'Stop' when you finish Appending your file");
				while(!(Source = Bfr.readLine()).equals("Stop")){
					
					Fw.append(Source + System.getProperty("line.separator"));
					
				}
				
				System.out.println("Thanks Jhanvi !! Your File Appended Successfully.");
			}
			
			Bfr.close();
			Fw.close();
			
		}catch(Exception e){

	        System.out.println("Error : ");	
			e.printStackTrace();
			
		}

	}

 }	