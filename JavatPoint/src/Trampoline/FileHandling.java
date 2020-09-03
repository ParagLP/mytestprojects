package Trampoline;
import java.io.*;
import java.io.DataOutputStream;

public class FileHandling {

	public static void main(String[] args)throws Exception
	{
		
		File f=new File("demo.txt");
		FileOutputStream fs=new FileOutputStream(f);
		DataOutputStream ds=new DataOutputStream(fs);
		ds.writeUTF("123 handling");
		ds.close();
		
		FileInputStream fi=new FileInputStream(f);
		DataInputStream di=new DataInputStream(fi);
		String s1=di.readUTF();
		System.out.println(s1);

	}

}
