package FileHandling.FileReading;
import java.io.*;

public class FileReading{
	
	public static String str = new String("");
	public FileReading(){
		
		try{
			
			File file = new File("F:/abc/Jhanvi.txt");
			if(!file.exists()){
				
				file.createNewFile();
				
			}
			
			FileReader fr = new FileReader(file);
			BufferedReader bfr = new BufferedReader(fr);
			while((str = bfr.readLine()) != null){
					
				System.out.println(str);
					
			}
			
			bfr.close();
			fr.close();
			
		}catch(Exception e){

			System.out.println("Error : ");	
			e.printStackTrace();
			
		}

	}

}	