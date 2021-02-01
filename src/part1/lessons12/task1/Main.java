package part1.lessons12.task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


public class Main {



    public static void main(String[] args) {
    	File a1=new File("C://Somedir");
    	File c1=new File("C://Copydir");
    	boolean a=a1.mkdir();
    	boolean c=c1.mkdir();
    	File myfile =new File("C://Somedir","New_file.txt");
    	try {
    		boolean b=myfile.createNewFile();
    		if (b)System.out.println("File has been created");

		}
    	catch (IOException e){
    		System.out.println(e.getMessage());

		}
    	System.out.println("File name :"+myfile.getName());
    	if (myfile.exists())
    		System.out.println("File exists");
    	else
    		System.out.println("File not found");
    	File renamefile= new File("C://Somedir","file_rename.txt");
    	myfile.renameTo(renamefile);
    	if (myfile.exists())
			System.out.println("Error");
		else
			System.out.println("File remane");
		System.out.println("New file name :"+renamefile.getName());
		if (renamefile.exists())
			System.out.println("Rename coplete");
		else
			System.out.println("Error");
		/*try{
			Files.copy(renamefile.toPath(),c1.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e){
			e.getStackTrace();
		}
		*/

		boolean b=renamefile.delete();
		if (b)
			System.out.print(renamefile.getName()  + " \n "+ "File has been removed");

    }
}
