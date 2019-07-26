import java.io.*;
import java.util.*;

class CountFileDirectory{
	
	public static void main(String args[]){
	
		System.out.println("Enter the Path of your Directory/Folder :");
		Scanner getDir = new Scanner(System.in);
		String Directory = getDir.nextLine();
		char[] Arr = Directory.toCharArray();
		int x,Count = 0;
		for(int i=0; i<Directory.length(); i++){
			
			if(Arr[i] == '/'){
			
				Count++;
				
			}

		}
		String[] DirComp = Directory.split("/"); 
		System.out.println("\nYour Current Directory/Folder is : " + DirComp[Count] + "\n");
		File f = new File(Directory);
		int DirectoryCount = 0;
		int FileCount = 0;
		
		for(File file : f.listFiles()){
			
			if(file.isFile()){
				
				FileCount++;
				
			}
			
			if(file.isDirectory()){
				
				DirectoryCount++;
				
			}

		}
		
		System.out.println("No. Of Files     : " + FileCount);
		System.out.println("No. Of Directory : " + DirectoryCount);
		
	}

}	
			
			
			
			
			