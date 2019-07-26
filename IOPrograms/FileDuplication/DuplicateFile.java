import java.io.*;

class DuplicateFile{
	
	public static void main(String args[]) throws Exception{
		
		File ExistFile = new File("F:/Spm-2099 (1).jpeg");
		File CopyFile = new File("F:/Spm-2099 (2).jpeg");
		
		FileInputStream x = new FileInputStream(ExistFile);
		FileOutputStream y = new FileOutputStream(CopyFile);

		byte[] Buffer = new byte[8 * 1024];
		int rd;
		while((rd = x.read(Buffer)) != -1){
			
			y.write(Buffer);
			
		}
		System.out.println("\nFile Copied Successfully !!");
		
		x.close();
		y.close();
		
	}

}	