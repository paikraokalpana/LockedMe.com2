package lockedme.com;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class SourceCode {



Scanner sc =new Scanner (System.in);
public void retrive()
{
	System.out.println("Enter File Path");
	String n=sc.nextLine();
	File f=new File(n);
	String s[]=f.list();
	if (s!=null)
	{
		for(int i=0; i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	else
		 System.out.println("File Not Found");
}
public void add()
{
	System.out.println("Enter file name which you want to created");
	String s1=sc.nextLine();
	File f1=new File(s1);
	try {
		if (f1.exists()==false) {
			f1.createNewFile();
			System.out.println("File successfully created");
			
		}
		else {
			System.out.println("File already Exists");
			
		}
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
}
public void delete()
{
	System.out.println("Enter file name which you want to delete");
	String s2=sc.nextLine();
	File f2=new File(s2);
	if(f2.exists()==true)
	{
		f2.delete(); System.out.println("File does not exist");
		
	}
}
public void searchfile()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the file name to search:");
	String filename= sc.nextLine();
	System.out.println("Enter the directory to search in :");
	String directoryPath= sc.nextLine();
	File f=new File(directoryPath);
	File[] files=f.listFiles();
	boolean isFound=false;
	try
	{
		for(File file:files)
		{
			if(file.isFile() && file.getName().equals(filename))
			{
				System.out.println("File found:"+file.getAbsolutePath());
				isFound=true;
				
			}
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage()+"wrong input entered");
		
	}
}
	}


