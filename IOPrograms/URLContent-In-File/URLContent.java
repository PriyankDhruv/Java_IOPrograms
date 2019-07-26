import java.io.*;
import java.net.*;
import java.util.*;

public class URLContent{
	
	public static void main(String args[]){
		
		System.out.println("Enter the URL : ");
		Scanner getWeb = new Scanner(System.in);
		String WebShooter = getWeb.nextLine();
		
		try{
			
		    URL	url = new URL(WebShooter);
			URLConnection Conn = url.openConnection();
			
			BufferedReader Br = new BufferedReader(new InputStreamReader(Conn.getInputStream()));	
			String InputLine;
			String fileName = "F:/abc/dhruv.html";
			File file = new File(fileName);
			if(!file.exists()){
				
				file.createNewFile();
				
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter Bw = new BufferedWriter(fw);
			while((InputLine = Br.readLine()) != null){
				
				Bw.write(InputLine);
				
			}

			Bw.close();
			Br.close();
			
		}catch(MalformedURLException e){

	        e.printStackTrace();

		}catch(IOException e){

		    e.printStackTrace();
			
		}

	}

}	
		